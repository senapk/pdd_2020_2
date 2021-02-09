import java.util.*;

public class Battle {
    public void play(List<Player> players){
        Scanner scanner = new Scanner(System.in);
        System.out.println(players);
        while(players.size() > 1){
            scanner.next();
            for(Player player : new ArrayList<Player>(players)){
                Player target = player.selectTarget(players);
                System.out.print(player + " ---> " + target);
                player.attack(target);
                System.out.println("");
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
        //players.add(new Iguana());
        //players.add(new Teju());
        //players.add(new Teju());
        //players.add(new Komodo());
        players.add(new Sapo());
        players.add(new Creeper("joao"));
        players.add(new Camaleao());
        Collections.shuffle(players);

        battle.play(players);
    }
}
