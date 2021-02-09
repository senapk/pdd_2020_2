import java.util.*;
interface Player{
    String getNome();
    boolean isAlive();
    Player selectTarget(List<Player> lista);
    void attack(Player other);
    void receiveDamage(int damage, Player other);
}