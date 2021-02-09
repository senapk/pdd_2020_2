import java.util.*;

class Teju extends Tixa{
    public void attack(Player other){
        if(!isAlive() || other == null || !other.isAlive())
            return;
        if(random.nextInt(10) == 0)
            other.receiveDamage(10 * forca, this);
        else
            other.receiveDamage(forca, this);
    }

    public void receiveDamage(int damage, Player other){
        this.vida -= damage;
        if(this.isAlive() && other != null)
            other.receiveDamage(2 * forca, null);
    }
    @Override
    public String getNome() {
        return "🦎" + nome;
    }
}