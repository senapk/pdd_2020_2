import java.util.*;

class Iguana extends Tixa{
    @Override
    public String getNome() {
        return "🦄" + nome;
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