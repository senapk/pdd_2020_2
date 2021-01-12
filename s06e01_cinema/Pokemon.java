import java.util.Random;
import java.util.Scanner;

class EvolutionStone {
    int envelhecimento;
    int upSaciedadeMax;
    int upFelicidadeMax;
    int upEnergiaMax;
    int upLimpezaMax;

    EvolutionStone (){
        this.envelhecimento = 10;
        this.upSaciedadeMax = 10;
        this.upFelicidadeMax = 10;
        this.upEnergiaMax = 10;
        this.upLimpezaMax = 10;
    }
}

public class Pokemon {
    String nome;
    int saciedade;
    int saciedadeMax;
    int felicidade;
    int felicidadeMax;
    int energia;
    int energiaMax;
    int limpeza;
    int limpezaMax;
    int idade;
    int idadeMax;
    int frutinhas;
    boolean vivo;
    EvolutionStone pedra;
    
    Pokemon (String nome, int saciedadeMax, int felicidadeMax, int energiaMax, int limpezaMax){
        this.nome = nome;
        this.saciedadeMax = saciedadeMax;
        this.felicidadeMax = felicidadeMax;
        this.energiaMax = energiaMax;
        this.limpezaMax = limpezaMax;

        this.energia = this.energiaMax;
        this.felicidade = this.felicidadeMax;
        this.saciedade = this.saciedadeMax;
        this.limpeza = this.limpezaMax;
        this.frutinhas = 0;
        this.idade = 0;
        this.idadeMax = 100;
        this.vivo = true;
        this.pedra = null;
    }

    public void setSaciedade (int valor){
        if (valor <= 0){
            this.saciedade = 0;
            this.vivo = false;
            System.out.println("e morreu de fome");
            return;
        }
        if (this.saciedade + valor >= this.saciedadeMax){
            this.saciedade = saciedadeMax;
            return;
        }
        this.saciedade += valor;
    }
    public void setIdade (int valor) {
        if (valor <= 0){
            System.out.println("impossivel voltar no tempo");
        }
        else if (this.idade + valor >= this.idadeMax){
            this.vivo = false; 
            System.out.println("e morreu de velhice");
        } else {
            this.idade += valor;
        }
    }
    
    public void setLimpeza (int valor) {
        if (valor <=0){
            this.limpeza = 0;
            this.vivo = false;
            System.out.println("e morreu na imundice");   
        }
        if (this.limpeza + valor >= this.limpezaMax){
            this.limpeza = limpezaMax;
        } else {
            this.limpeza += valor;
        }
    }

    public void setFelicidade (int valor){
        if (valor <= 0){
            this.felicidade = 0;
            this.vivo = false;
            System.out.println("e morreu de desgosto");
        }
        if (this.felicidade + valor >= this.felicidadeMax){
            this.felicidade = felicidadeMax;
        } else {
            this.felicidade += valor;
        }
    }

    public void setEnergia (int valor){
        if (valor <= 0){
            this.energia = 0;
            this.vivo = false;
            System.out.println("e morreu de desgosto");
        }
        if (this.energia + valor >= this.energiaMax){
            this.energia = felicidadeMax;
        } else {
            this.energia += valor;
        }
    }

    int getEnergia (){
        return this.energia;
    }
    int getFelicidade (){
        return this.felicidade;
    }
    int getSaciedade (){
        return this.saciedade;
    }
    int getLimpeza (){
        return this.limpeza;
    }
    void bricar (String brincadeira){
        if (brincadeira.equals("volei")){
            setEnergia(this.energia - 3);
            setFelicidade(this.felicidade + 5);
            setSaciedade(this.saciedade - 2);
            setLimpeza(this.limpeza - 2);
            System.out.println("Haha isso é MUITOOOOOOO divertido");
        } else if (brincadeira.equals("dancar")){
            setEnergia(this.energia - 4);
            setFelicidade(this.felicidade + 4);
            setSaciedade(this.saciedade - 3);
            setLimpeza(this.limpeza - 1);
            System.out.println("Nossa, consegui o meu par perfeitooo <3");
        } else if (brincadeira.equals("esconde-esconde")){
            setEnergia(this.energia - 1);
            setFelicidade(this.felicidade + 2);
            setSaciedade(this.saciedade - 1);
            setLimpeza(this.limpeza - 2);
            System.out.println("Uauuu, queria me esconder da programação");
        } else {
            System.out.println("Comando invalido");
        }
}
    void comer (int quantidade){
        if (frutinhas < quantidade){
            System.out.println("Você não tem tudo isso de comida!!!");
            return;
        }
        if (frutinhas <= 0){
            System.out.println("Você não tem nenhuma frutinha seu bobinho!!!");
        }
        if (quantidade <= 0){
            System.out.println ("Comando invalido");
        } else {
            setEnergia (quantidade);
            setSaciedade(quantidade);
            this.frutinhas = this.frutinhas - quantidade;
            }
            if (saciedade == saciedadeMax){
                System.out.println("Você esta de buxim chei!");
            } else {
                System.out.println("Você comeu todas as frutinha que precisava!");
            }
        this.idade = idade + 1;
    }
    void dormir (int horas){//boto fé, hehe
        if (horas <= 0){
            System.out.println("Comando Inválido");
        }
        if (energia == energiaMax){
            System.out.println("Você já está bem descansado né?!");
        } else {
            System.out.println("a mimir");
            setEnergia(horas);
            setSaciedade(this.saciedade - horas);
        }
        this.idade += 1;  
    }
    void tomarbanho (){
            setLimpeza(this.limpezaMax);
            setEnergia(this.energia-2);
            this.idade += 1;
            System.out.println("lava, lava, lava\nlava, lava, lava\numa orelha, uma orelha\noutra orelha, outra orelha...");
    }
    void colher (){
        Random aleatorio = new Random();
        int chance = aleatorio.nextInt(11);
        if (energia > 0){
            this.energia = energia - 1;
            int colhidas = aleatorio.nextInt(4);
            System.out.println("Você achou " + colhidas + " frutinhas");
            this.frutinhas += colhidas;
            setLimpeza(-1);
            this.idade = idade + 1;
        }
        if (chance == 1 && pedra == null){
            pedra = new EvolutionStone ();
            System.out.println("Você achou uma pedra de Evolução");
        }
    }
    void evoluir (){
        if (pedra == null){
            System.out.println("você não tem nenhuma pedra, seu bobinho");

        } else {
            setIdade(pedra.envelhecimento);
            this.energiaMax += pedra.upEnergiaMax;
            this.felicidadeMax += pedra.upFelicidadeMax;
            this.limpezaMax += pedra.upLimpezaMax;
            this.saciedadeMax += pedra.upSaciedadeMax;
            setSaciedade(saciedadeMax);
            setEnergia(energiaMax);
            setLimpeza(limpezaMax);
            setFelicidade(felicidadeMax);
            System.out.println("Rumo a evolução supreeeeema!!!!");
            pedra = null;
        }
    }
    String proerd(){
        if (pedra == null){
            return "Não";
        } else {
            return "Sim";
        }
    }

public String toString(){
    return "O nome do seu pokemon é: " + nome + "\nSua energia é: " + energia + "/" + energiaMax + "\nSua saciedade é: " + saciedade + "/" + saciedadeMax +  "\nSua limpeza é: " + limpeza + "/" + limpeza + "\nSuas frutinha são: " + frutinhas + "\nPedra de evolução: " + proerd() + "\nIdade: " + idade;
}
public static void main(String[] args) {
    System.out.println("Crie aqui o seu Pokemon");
    System.out.println("Digite pokebola, o nome do seu pokemon e os atributos na mesma linha");
    System.out.println("Em ordem eles são: nome, saciedade maxima,"+"\nfelicidade maxima, energia máxima e limpeza maxima");
    System.out.println("Aqui vai o menu de ações!");
    System.out.println("Digite parar para parar o código");
    System.out.println("Digite comer e o numero de frutinhas para que eu me alimente");
    System.out.println("Digite dormir e as horas de soninho para que eu tire uma soneca");
    System.out.println("Digite banho para que eu me limpe");
    System.out.println("Digite colher para que eu pegue frutinhas");
    System.out.println("Digite jogar e o nome de um dos jogos abaixo para eu me divertir");
    System.out.println("volei ou dancar ou esconde-esconde");
    Scanner scanner = new Scanner(System.in);
    Pokemon pokemon = new Pokemon("jeff", 0, 0, 0, 0);
    while(true){
        String line = scanner.nextLine();
        String ui[] = line.split(" ");
        if(pokemon.vivo == false){
            break;
        }
        if (ui[0].equals("pokebola")){
            pokemon = new Pokemon (ui[1], Integer.parseInt(ui[2]), Integer.parseInt(ui[3]), Integer.parseInt(ui[4]), Integer.parseInt(ui[5]));
            System.out.println(pokemon);
        } else if(ui[0].equals("parar")){
            break;
        } else if(ui[0].equals("status")){
            System.out.println(pokemon);
        }else if(ui[0].equals("evoluir")){
            pokemon.evoluir();
            System.out.println(pokemon);
        } else if (ui[0].equals("comer")){
            pokemon.comer(Integer.parseInt(ui[1]));
            System.out.println(pokemon);
        } else if (ui[0].equals("dormir")){
            pokemon.dormir(Integer.parseInt(ui[1]));
            System.out.println(pokemon);
        } else if (ui[0].equals("banho")){
            pokemon.tomarbanho();
            System.out.println(pokemon);
        } else if (ui[0].equals("colher")){
            pokemon.colher();
            System.out.println(pokemon);
        } else if (ui[0].equals("brincar")){
            pokemon.bricar(ui[1]);
            System.out.println(pokemon);
        } else {
            System.out.println("fail: comando invalido");
        }
    }
    scanner.close();
    }
}