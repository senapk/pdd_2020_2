import java.util.*;
class Creeper extends Tixa {
    List<Player> players;
    public Creeper(String nome) {
        super();
        this.nome = nome;
        forca -= 2;
        vida -= 10;
    }
    public String getNome(){
        return "💣" + nome;
    }
    
    public Player selectTarget(List<Player> lista){
        this.players = lista;
		return super.selectTarget(lista);
	}

    public void receiveDamage(int damage, Player other){
        this.vida -= damage;
        if (!isAlive()) {
			System.out.print(" Hora de morre errrr");
            if(this.players != null){
                for (Player player : this.players) {
                    if(player.isAlive())
                        player.receiveDamage(this.forca * 2, null);
                }
            }
        }
    }
}
    
    
    
    
    
    
    
    
