import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

class Pessoa {
    String nome;
    int idade;
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String toString() {
        return nome + ":" + idade;
    }
}

class Agenda{
    TreeMap<String, Pessoa> rep;
    public Agenda(){
        rep = new TreeMap<>();
    }
    public void add(String nome, int idade){
        if(rep.containsKey(nome)){
            System.out.println("ja existe alguem com esse nome");
            return;
        }
        rep.put(nome, new Pessoa(nome, idade));
    }
    public String toString() {
        return "" + rep.values();
    }
    
    public void remove(String name){
        rep.remove(name);
    }

    public void fazerAniversario(String name){
        Pessoa pessoa = rep.get(name);
        if(pessoa == null)
            System.out.println("Nao existe");
        else
            pessoa.idade += 1;
    }

    public Pessoa remover(String name){
        Pessoa pessoa = rep.remove(name);
        if(pessoa == null)
            System.out.println("Nao existe");
        return pessoa;
    }


    public ArrayList<Pessoa> search(String pattern){
        ArrayList<Pessoa> aux = new ArrayList<>();
        for(Pessoa pessoa : rep.values())
            if(pessoa.toString().contains(pattern))
                aux.add(pessoa);
        return aux;
    }

}

public class AgendaMapa{ //então quando a gente chama o comparador pra rep a gente ja esta dizendo que quer orgnaizar ela inteira?
    public static void main(String[] args) {
        Agenda ag = new Agenda();
        ag.add("luan", 12);
        ag.add("vanessa", 12);
        ag.add("bruna", 84);
        ag.add("caio", 75);
        ag.add("camila", 3);
        ag.add("carol", 1);
        System.out.println(ag);   
        System.out.println(ag.search("ca"));     
    }
}