public class Zumbie {
    String nome;
    int resistencia;
    int maxResistencia;
    int vida;
    int maxVida;
    boolean estado;

        // parametros, bloco
    Zumbie(int resistencia, int vida){//atributos
        this.resistencia = resistencia;
        this.maxResistencia = resistencia;
        this.vida = vida;
        this.maxVida = vida;
        this.estado = true;
    }
    //ações a serem execultada, mudam os atributos
    void atirar(){ //métodos -> comportamento
        if (resistencia > 0){
            System.out.println("O zumbie perdeu 2 de resistencia, restam: " + resistencia);
            resistencia -= 2;
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

    public String toString() {
        return "Res:" + resistencia + "/" + maxResistencia + " Vida:" + vida + "/" + maxVida + " Vivo:" + estado;
    }
    public static void main(String[] args) { 
        //tipo nome_da_referencia
        Zumbie sharter = new Zumbie(6, 4);
        System.out.println(sharter);

        sharter.atirar();
        sharter.atirar();
        sharter.atirar();
        sharter.atirar();
        sharter.atirar();
        sharter.atirar();
        sharter.atirar();
        System.out.println(sharter);
    }
}
