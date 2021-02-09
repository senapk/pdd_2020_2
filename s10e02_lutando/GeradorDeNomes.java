import java.util.*;

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