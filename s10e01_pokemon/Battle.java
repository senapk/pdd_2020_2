import java.util.*;
interface Player{
    String getNome();
    boolean isAlive();
    Player selectTarget(List<Player> lista);
    void attack(Player other);
    void receiveDamage(int damage, Player other);
}
class GeradorNomes{
    static public String gerar(){
        Random random = new Random();
        String consoa = "BCDFGHJKLMNPQRSTVWXYZ";
        String vogais = "aeiou";
        String nome = "" + consoa.charAt(random.nextInt(consoa.length()));
        nome += vogais.charAt(random.nextInt(vogais.length()));
        nome += consoa.toLowerCase().charAt(random.nextInt(consoa.length()));
        nome += vogais.charAt(random.nextInt(vogais.length()));
        return nome;
    }
}
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
        return "L_" + nome;
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
class Iguana extends Tixa{
    @Override
    public String getNome() {
        return "I_" + nome;
    }
    public Player selectTarget(List<Player> lista){
        ArrayList<Player> aux = new ArrayList<>();
        for(Player player : lista){
            if(player != this && player.isAlive())
                aux.add(player);
        }
        if(aux.size() == 0)
            return null;
        return aux.get(random.nextInt(aux.size()));
    }
}

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
        return "T_" + nome;
    }
}

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

public class Battle {
    public void play(List<Player> players){
        Scanner scanner = new Scanner(System.in);
        System.out.println(players);
        while(players.size() > 1){
            //lutar round
            System.out.print("Ready? (y/n)");
            scanner.next();
            for(Player player : players){
                Player target = player.selectTarget(players);
                System.out.println(player + " ---> " + target);
                player.attack(target);
            }
            //remover mortos
            System.out.println(players);
            ArrayList<Player> vivos = new ArrayList<>();
            for(Player player : players)
                if(player.isAlive())
                    vivos.add(player);
            players = vivos;
        }
        scanner.close();
    }
    public static void main(String[] args) {
        Battle battle = new Battle();
        List<Player> players = new ArrayList<>();
        for(int i = 0; i < 3; i++)
            players.add(new Tixa());
        players.add(new Iguana());
        players.add(new Teju());
        players.add(new Teju());
        players.add(new Komodo());
        Collections.shuffle(players);

        battle.play(players);
    }
}
