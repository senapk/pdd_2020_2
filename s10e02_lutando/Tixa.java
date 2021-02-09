import java.util.*;
class Tixa implements Player {
    protected String nome;
    int forca;
    int vida;
    Random random;
    public Tixa(){
        this.nome = GeradorNomes.gerar();
        random = new Random();
        forca = random.nextInt(6) + 5;
        vida = random.nextInt(31) + 20;
    }
    public String getNome(){
        return "🐮" + nome;
    }
    public boolean isAlive(){
        return vida > 0;
    }
    public Player selectTarget(List<Player> lista){
        return lista.get(random.nextInt(lista.size()));
    }
    public void attack(Player other){
        if(!isAlive() || other == null || !other.isAlive())
            return;
        other.receiveDamage(forca, this);
    }
    public void receiveDamage(int damage, Player other){
        this.vida -= damage;
    }
    public String toString(){
        return getNome() + ":" + forca + ":" + vida;
    }
}