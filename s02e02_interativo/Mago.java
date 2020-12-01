import java.util.Scanner;
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
                System.out.println("contemplem o mago, com seus poderes");
                System.out.println("Incriveis podereessssssssssssssssss");
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

    boolean equals(Mago other){
        return nome.equals(other.nome);
    }

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
/*
init Patolino
show
Name: Patolino
init Ahsoka Tano
show
Name: Ahsoka Tano
end
atirar fogo 5
*/


