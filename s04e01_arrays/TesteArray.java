import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Arr{
    public static void main(String[] args) {
        String[] cores = new String[3];
        //cores[0] = "blue";
        //cores[1] = "red";
        //cores[2] = "yellow";

        System.out.println(Arrays.asList(cores));

        //Array
        String[] dds = {"Sunday", "ter", "qua", "qui", "sex", "sab"};
        for(String dia : dds) //for each - for range
            System.out.print(dia + " ");
        System.out.println("");

        Integer[] nums = {1, 3, 5, 2, 7};

        for(int num : nums)
            System.out.print(num + " ");
        System.out.println("");

        //List
        int x = Integer.parseInt("10");
        System.out.println(Arrays.asList(nums)); //List

        for(int i = 0; i < dds.length; i++)//lenght
            System.out.print(dds[i] + " ");//acesso atraves do []
        System.out.println("");

        for(int i = 0; i < nums.length; i++)
            nums[i] = nums[i] + 1; //escrita e leitura atraves de []
        
        //{2, 4, 6, 3, 8};

        nums[0] = 9; //escrita Array
        //nums.set(0, 9);//ArrayList
        System.out.println(nums[4]);//Array
        //System.out.println(nums.get(4));//ArrayList

        System.out.println(Arrays.asList(nums));
    }
}

class ListSample{
    public static void main(String[] args) {
        List<String> herois = Arrays.asList("batman", "jaspion", "jiban", "jiraia");
        System.out.println(herois);
        
        System.out.println(herois.get(2));
        herois.set(0, "justiceiro");
        System.out.println(herois);
    }
}

class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<String> amigos = new ArrayList<>();
        System.out.println(amigos.size()); //0
        amigos.add("Ash");
        amigos.add("Richard");
        System.out.println(amigos);
        System.out.println(amigos.size()); //2
        amigos.add("MaryAna");
        amigos.add("Aurivanio");
        String kaique = "Kaique";
        amigos.add(kaique);
        System.out.println(amigos);

        //amigos.remove(4);
        amigos.remove(kaique);
        System.out.println(amigos);

        for(int i = 0; i < amigos.size(); i++){
            if(amigos.get(i).equals("Richard")){
                amigos.remove(i);
                break;
            }
        }
        System.out.println(amigos);

        amigos.addAll(Arrays.asList("Ariadne", "Igor", "Ryan", "Karen"));
        System.out.println(amigos);

        System.out.println(amigos.indexOf("Igor"));

        amigos.add(0, "Leticia");
        System.out.println(amigos);
        System.out.println(amigos.contains("Karen"));
        System.out.println(amigos.contains("Hyago"));
        
        for(int i = 0; i < amigos.size(); i++){
            if(amigos.get(i).charAt(0) == 'A'){
                amigos.set(i, "*" + amigos.get(i));
            }
        }
        System.out.println(amigos);
    }
}

class Pessoa{
    String nome;
    int idade;
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String toString(){
        return nome + ":" + idade;
    }
}

public class TesteArray{
    public static void main(String[] args) {
        ArrayList<Pessoa> inimigos = new ArrayList<>();
        inimigos.add(new Pessoa("Garfield", 2));
        inimigos.add(new Pessoa("Rey", 33));
        inimigos.add(new Pessoa("Palpatine", 200));

        System.out.println(inimigos);

        inimigos.addAll(Arrays.asList(new Pessoa("Thor", 500), new Pessoa("Rocket", 20)));
        System.out.println(inimigos);

        for(int i = 0; i < inimigos.size(); i++){
            if(inimigos.get(i).nome.equals("Rey")){
                inimigos.get(i).idade += 100;
            }
        }

        for(int i = 0; i < inimigos.size(); i++){
            if(inimigos.get(i).nome.equals("Thor")){
                //substituir o objeto
                //inimigos.set(i, new Pessoa("Capitao", 40));
                inimigos.get(i).nome = "Capitao";
                inimigos.get(i).idade = 40;
            }
        }

        System.out.println(inimigos);
    }
}