class Pokemon{
    private int energia; //package ~ -> tudo que estiver no mesmo pacote pode utilizar
    private int energiaMax;
    private boolean alive; //só dentro dos metodos do Pokemon

    public Pokemon(int energiaMax){//em qualquer lugar
        this.energia = energiaMax;
        this.energiaMax = energiaMax;
        this.alive = true;
    }

    void setEnergia(int value){ //controlar as mudanças nos atributos
        this.energia = value;
        if(energia <= 0){ //controle de variavel
            this.energia = 0;
            this.alive = false;
            System.out.println("Meu pet morreu por falta de energia");
        }
        if(energia > energiaMax){
            energia = energiaMax;
        }
    }

    boolean verificarVivo(){
        if(!alive){
            System.out.println("Você não pode interagir com um pokemon morto");
            return false;
        }
        return true;
    }

    void brincar(){
        if(!verificarVivo())
            return;
        setEnergia(energia - 2);
    }

    void descansar(){
        if(!verificarVivo())
            return;
        setEnergia(energia + 2);
    }

    public boolean isAlive(){
        return alive;
    }

    public String toString() {
        return energia + "/" + energiaMax + ":" + alive;
    }

}

public class Aula{
    public static void main(String[] args) {
        Pokemon buba = new Pokemon(30);
        while(buba.isAlive()){
            buba.brincar();
            System.out.println(buba);
            System.out.println(buba.energia);
        }
        buba.energia = 6000;
        System.out.println(buba);
    }
}