import java.util.Arrays;
import java.util.Scanner; //para o exercício do Mago


public class SomandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite varios numeros em linha");
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        int qtd = tokens.length;
        System.out.println("Voce digitou " + qtd + " elementos");
        
        System.out.print("[ ");
        for(int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
        System.out.println("]");
        
        //somando todos
        float acc = 0;
        for(int i = 0; i < tokens.length; i++)
            acc += Float.parseFloat(tokens[i]);

        System.out.println("A soma deu " + acc);
        System.out.println(Arrays.asList(tokens));

        scanner.close(); //liberacao
    }
}

class ComparacaoStrings {
    public static void main(String[] args) {
        //true - mesma entrada na tabela de constantes
        System.out.println("A" == "A");

        //false - objetos diferentes
        System.out.println("A" == new String("A"));

        //true - mesmo conteúdo
        System.out.println("A".equals(new String("A")));
    }
}


public class Mago {
    String nome;
    String magia;
    int mana;
    Mago(String nome, String magia, int mana){
        this.nome = nome;
        this.magia = magia;
        this.mana = mana;
    }

    void lancarMagia(String magia, int forca){
        if(this.magia.equals(magia)){
            if(this.mana >= forca){
                System.out.println("contemplem o mago, com seus poderes, incríveis poderesssssss");
                this.mana -= forca;
            }else{
                System.out.println("Mana insuficiente");
            }
        }else{
            System.out.println("Nao sei essa magia");
        }
    }

    public String toString(){
        return "Nome: " + nome + " Magia: " + magia + " Mana: " + mana;
    }
}

public class Aula{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mago mago = new Mago("", "", 0);
        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){//init _nome _magia _mana
                mago = new Mago(ui[1], ui[2], Integer.parseInt(ui[3]));
            }else if(ui[0].equals("show")){//init _nome
                System.out.println(mago);
            }else if(ui[0].equals("magia")){//init _nome _forca
                mago.lancarMagia(ui[1], Integer.parseInt(ui[2]));
            }else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}