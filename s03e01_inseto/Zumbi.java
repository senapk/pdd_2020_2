import java.util.Scanner;

public class Zumbi {
    int resistencia;
    int maxResistencia;
    int vida;
    int maxVida;
    boolean estado;

        // parametros, bloco
    Zumbi(int resistencia, int vida){//atributos
        this.resistencia = resistencia;
        this.maxResistencia = resistencia;
        this.vida = vida;
        this.maxVida = vida;
        this.estado = true;
    }
    void status(){
        System.out.println("O zumbie tem "  + vida + " de vida");
        System.out.println("O zumbie tem " + resistencia + " de resistencia");
        if (estado == true){
            System.out.println("O zumbie permanece em pé!");
        }
        if (estado == false){
            System.out.println("O zumbie caiu!");
        }
    }
    void matrix (int x, int y){
        resistencia = x;
        vida = y;
    }
    //ações a serem execultada, mudam os atributos
    void tropecar(){ //métodos -> comportamento
            System.out.println("O zumbie tropeçou!");
            if (resistencia > 0){
                resistencia -= 2;
                System.out.println("O zumbie perdeu 2 de resistencia, restam: " + resistencia);
            }
            if (vida > 0 && resistencia == 0){
                System.out.println("O zumbie perdeu 1 de vida, restam: " + vida);
                vida -= 1;
            }
            if (vida <= 0){
                estado = false;
            }
            if (estado == true){
                System.out.println("O zumbie permanece em pé!");
            }
            if (estado == false){
                System.out.println("O zumbie caiu!");
            }
        }
        void regenerar(){
            System.out.println("O zumbie se regenerou!");
            if (vida < maxVida){
                System.out.println("O zumbie recuperou 1 de vida!");
                vida += 1;
            }
            if (resistencia < maxResistencia && vida == maxVida ){
                System.out.println("O zumbie ficou +2 resistente");
                resistencia += 2;
            }
            if (resistencia == maxResistencia && vida == maxVida){
                System.out.println("O zumbie esta no seu potencial máximo!!!");
            }
            if (resistencia == 0 && vida == 0 && estado == false){
                System.out.println("O zumbie esta 2X mais forte!!!");
                resistencia = 2*maxResistencia;
                vida = 2*maxVida;
                maxResistencia = resistencia;
                maxVida = vida;
            }
        }
        public static void main(String[] args) { 
            Scanner scanner = new Scanner(System.in);
            Zumbi sharter = new Zumbi(0,0);
            while(true){
                String line = scanner.nextLine();
                String[] ui = line.split(" ");
                if(ui[0].equals("end")){
                    break;
                } else if (ui[0].equals("criar")){ // ao criar seu zumbi tera que atribuir a resistencia e a vida do mesmo
                    sharter = new Zumbi (Integer.parseInt(ui[1]),  Integer.parseInt(ui[2]));
                } else if (ui[0].equals("empurrar")){ // você pode causar dano empurrado o zumbie
                    sharter.tropecar();
                } else if (ui[0].equals("regenerar")){ // pode também regenerar o seu zumbie
                    sharter.regenerar();
                } else if(ui[0].equals("status")){ //verificar a condição do seu zumbie (se esta em pé ou caido)
                    sharter.status();
                } else if(ui[0].equals("matrix")){ //ou até mesmo editar os atributos dele
                    sharter.matrix(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
                }   else{
                    System.out.println("fail: comando invalido");
                }
            };
            
            scanner.close();
            System.out.println(sharter);
        }
}
