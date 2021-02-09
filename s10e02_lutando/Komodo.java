import java.util.*;

class Komodo extends Tixa{
    int escudo;
    public Komodo(){
        this.escudo = random.nextInt(50);
    }
    public void receiveDamage(int damage, Player other){
        if(escudo > 0)
            escudo -= damage;
        else
            this.vida -= damage;
    }
    public String getNome() {
        return "K_" + nome;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ":" + escudo;
    }
}