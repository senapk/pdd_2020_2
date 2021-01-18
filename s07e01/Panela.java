import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

class Pessoa {
    String id;
    int afinidade;

    public Pessoa(String id){
        this.id = id;
        this.afinidade = 0;
    }

    public Pessoa(String id, int afinidade){
        this.id = id;
        this.afinidade = afinidade;
    }
    public String toString(){
        return this.id + ":" + this.afinidade;
    }
    
    // public boolean equals(Object obj){
    //     if(obj instanceof Pessoa){
    //         Pessoa other = (Pessoa) obj;
    //         return this.id.equals(other.id);
    //     }
    //     return false;
    // }

    public boolean equals(Object obj){
        if(obj instanceof Pessoa)
            return this.id.equals(((Pessoa) obj).id);
        return false;
    }
}

class ComparaPessoaPorNome implements Comparator<Pessoa>{
    //  < 0   se one <  two
    //  > 0   se one >  two
    // == 0   se one == two
    public int compare(Pessoa one, Pessoa two) {
        // "ana".compareTo("bia") -1
        // "bia".compareTo("caio") -1
        // "leticia".compareTo("mirella") -1
        // "mirella".compareTo("leticia") 1
        return one.id.compareTo(two.id);
    }
}

class ComparaPessoaPorAfinidade implements Comparator<Pessoa>{
    public int compare(Pessoa one, Pessoa two) {
        //return one.afinidade - two.afinidade;
        int resultado = Integer.compare(two.afinidade, one.afinidade);
        if(resultado != 0)
            return resultado;
        return one.id.compareTo(two.id);
    }
}


public class Panela {
    public static void main(String[] args) {
        ArrayList<Pessoa> panela = new ArrayList<Pessoa>();
        panela.add(new Pessoa("Macedo", 10));
        panela.add(new Pessoa("Breno", 4));
        panela.add(new Pessoa("Miguel", 2));
        panela.add(new Pessoa("Falcao", 7));
        panela.add(new Pessoa("Joas", 5));
        panela.add(new Pessoa("Gui", 10));

        // "banana".equals("banana"); //true
        // "banana".equals(new String("banana")); //true
        //boolean res = new Pessoa("Gui", 10).equals("Gui"); //false
        //System.out.println(res);
        int pos = panela.indexOf(new Pessoa("Falcao"));
        System.out.println(pos);

        System.out.println(panela.indexOf(new Pessoa("Breno")));



        Collections.sort(panela, new ComparaPessoaPorAfinidade());
        System.out.println(panela);



        ArrayList<String> nomes = new ArrayList<String>();
        nomes.addAll(Arrays.asList("bruno", "ana", "diego", "bras", "eliane"));
        Collections.sort(nomes);
        System.out.println(nomes);
        //funcoes como elementos de primeira ordem
    }
}
