import java.util.*;

public class Sapo extends Tixa{
    List<Player> lista;
    @Override
    public String getNome() {
        return "🐸" + nome;
    }

    public Player selectTarget(List<Player> lista){
        this.lista = lista;
        return super.selectTarget(lista);
	}

    public void attack(Player other){
        lista.add(new Creeper(this.nome));
        if(!isAlive() || other == null || !other.isAlive())
            return;
        if(random.nextInt(5) == 0){
            System.out.print(" Critical Hit");
            other.receiveDamage(6 * forca + 1, this);
        }else
            other.receiveDamage(forca / 2 + 1, this);        
    }
}