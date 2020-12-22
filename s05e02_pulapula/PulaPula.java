import java.util.ArrayList;

class Crianca {
    String nome;
    int idade;

    public Crianca(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return nome  + ":" + idade;
    }

}

public class PulaPula {
    ArrayList<Crianca> esperando = new ArrayList<>();
    ArrayList<Crianca> brincando = new ArrayList<>();

    public PulaPula() {

    }

    public String toString() {
        return esperando + ":" + brincando;
    }

    void chegar(Crianca kid) {
        esperando.add(0, kid);
    }

    void entrar(Crianca kid) {
        if(esperando.isEmpty()){
            System.out.println("fail: ninguém esperando");
            return;
        }
        int ultimo = esperando.size() -1;
        Crianca aux = esperando.get(ultimo);
        brincando.add(0, aux);
        esperando.remove(ultimo);
    }

    Crianca sair(String nome){
        for (PulaPula brincando :  )
    }

    //merry christmas!!!

    public static void main(String[] args) {
        ArrayList<String> esperando = new ArrayList<>();
        ArrayList<String> brincando = new ArrayList<>();
        
        


        esperando.add(0, "p1");
        esperando.add(0, "p2");
        esperando.add(0, "p3");

        System.out.println(esperando);
    
        brincando.add(0, esperando.get(esperando.size() - 1));
        esperando.remove(esperando.size() -1);

        System.out.println(esperando);
        System.out.println(brincando);
        
        brincando.add(0, esperando.get(esperando.size() - 1));
        esperando.remove(esperando.size() -1);

        System.out.println(esperando);
        System.out.println(brincando);


        
    }
}

