import java.util.ArrayList;
import java.util.Scanner;

class Operacao {
    int id;//ordem q a operação foi feita
    String nome;
    float valor;//movimentação
    float saldo;//saldo atual da conta ao executar uma operação
    
    Operacao(int id, String nome, float valor, float saldo){
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.saldo = saldo;
    }
    public String toString (){
        return id + ": " + nome + ": " + valor + ": " + saldo;
    }
}
public class ContaBancaria {
    int id;//
    int numero;
    float saldo;
    ArrayList<Operacao> extrato;
    ArrayList<String> estornados;

    ContaBancaria(int numero){
        this.id = 0;
        this.numero = numero;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
        this.estornados = new ArrayList<>();
    }

    private void addOperacao(String label, int valor){
        this.saldo += valor;
        this.extrato.add(new Operacao(this.id, label, valor, this.saldo));
        this.id += 1;
    }

    void saque(int valor){
        if (valor <= 0){
            System.out.println("não vai tá dando");
            return;
        }
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.addOperacao("saque", valor);
        System.out.println("Saque de R$ " + valor + " realizado com sucesso");
    }
    void deposito(int valor){
        if (valor <= 0){
            System.out.println("não vai tá dando");
            return; 
        }
        this.addOperacao("depo", valor);
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso");

    }
    void extratoCompleto(){
        for (int i = 0; i < this.extrato.size(); i++){
            System.out.println(this.extrato.get(i));
        }
    }
    void extratoParcial(int numero){
        ArrayList<Operacao> retorno = new ArrayList<Operacao>(); 
        if (numero - this.extrato.size() <= 0){
            System.out.println(extrato);
            return;
        }
        if (numero <= 0){
            System.out.println("Comando invalido");
            return;
        }
        for(int i = (this.extrato.size() - numero) + 1; i <= this.extrato.size(); i++){
            retorno.add(this.extrato.get(i));
        }
        System.out.println(retorno);
    }
    void tarifa(int valor){
        if (valor <= 0) {
            System.out.println("não dá mas vc nao tá gastando dinheiro pelo menos");
            return;
        }
        if (valor > this.saldo){
            System.out.println("tá sem dinheiro ne minha filha?");
            return;
        }
        this.saldo -=valor;
        this.extrato.add(new Operacao(this.id, "Tarifa", (-valor), this.saldo));
        this.id += 1;
        System.out.println(valor + " indo embora");

    }
    int verificarEstorno(int id){
        if(estornados == null){
            return -1;
        }
        for (int i = 0; i < estornados.size(); i++){
            int valor = Integer.parseInt(this.estornados.get(i));
            if(id == valor){
                return id;
            }
        }
        return -1;
    }
    void estornar (ArrayList<String> array){
        ArrayList<String> index = array;
        for (int i = 0; i < index.size(); i++){
            int idEstorno = Integer.parseInt(index.get(i));//converte o id q foi dado no array de estorno para int
            if (idEstorno >= extrato.size() || idEstorno < 0){//verificar se o id passado esta contido no extrato
                System.out.println("id não existe");//id nao existe
                return;
            }
            if(verificarEstorno(idEstorno) != -1){
                System.out.println("O indice " + idEstorno + " ja foi estornado");
                return;
            }
            if (this.extrato.get(idEstorno).nome.equals("Tarifa")){
                this.saldo -= this.extrato.get(idEstorno).valor;
                this.extrato.add(new Operacao(this.id, "Estorno", (-this.extrato.get(idEstorno).valor), this.saldo));
                this.estornados.add(index.get(i));
                this.id += 1;
                System.out.println("Estorno de R$ " + (-this.extrato.get(idEstorno).valor) + " aprovado");
                return;
            }
            if (idEstorno == this.extrato.get(idEstorno).id){
                System.out.println("O id: " + idEstorno + " é um " + this.extrato.get(idEstorno).nome + " e não uma Tarifa");
                return;
            }
            System.out.println("O id: " + idEstorno + " é invalido");
        }
    }
    public String toString (){
        return "O numero da conta é: " + this.numero;
    }
    public static void main (String[] args) {
        System.out.println("Seja bem vindo sua Conta Bancária\nAqui você podera simular... uma Conta Bancária\nAqui abaixo vão os comandos que você pode inserir:\nabrirConta (numero da conta)\ndepositar (valor)\nsacar (valor)\ntarifa (valor) \nestornar (quais movimentações vão ser estornadas) \nextratoParcial \nextrato \nparar --> para o código");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da sua conta e o saldo inicial");
        int numero = scanner.nextInt();
        int saldo = scanner.nextInt();
        ContaBancaria conta = new ContaBancaria(numero);
        conta.deposito(saldo);


        while (true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if (ui[0].equals("abrirConta")){
                conta = new ContaBancaria(Integer.parseInt(ui[1]));
                conta.extrato.add(new Operacao(conta.id, "abertura", 0, conta.saldo));
                conta.id += 1;
                System.out.println(conta);
            } else if (ui[0].equals("parar")){
                break;
            } else if (ui[0].equals("extrato")){
                conta.extratoCompleto();
                System.out.println(conta);
            } else if (ui[0].equals("extratoParcial")){
                conta.extratoParcial(Integer.parseInt(ui[1]));
                System.out.println(conta);
            } else if (ui[0].equals("sacar")){
                conta.saque(Integer.parseInt(ui[1]));
                System.out.println(conta);
            } else if (ui[0].equals("depositar")){
                conta.deposito(Integer.parseInt(ui[1]));
                System.out.println(conta);
            } else if (ui[0].equals("tarifa")){
                conta.tarifa(Integer.parseInt(ui[1]));
                System.out.println(conta);
            } else if (ui[0].equals("estornar")){
                ArrayList<String> array = new ArrayList<String>();
                for (int i = 1; i < ui.length; i++)
                    array.add(ui[i]);
                conta.estornar(array);
                System.out.println(conta);
            } else {
                System.out.println("Erro: comando invalido");
            }
        }
        scanner.close();
    }
}

