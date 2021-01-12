import java.util.ArrayList;
// import java.util.Collections;

class Pessoa{
    String id;
    String fone;
    public Pessoa(String id, String fone){
        this.id = id;
        this.fone = fone;
    }
    public String toString(){
        return this.id + ":" + this.fone;
    }
}

class Sala{
    private ArrayList<Pessoa> cadeiras;


    //retorna a posição que a pessoa esta no vetor ou -1
    private int indexOf(String id){
        for (int i = 0; i < cadeiras.size(); i++) {
            if (cadeiras.get(i) != null && cadeiras.get(i).id.equals(id)) {
                return i;
            } 
        }
        return -1;
    }

    private Pessoa find(String id){
        for (int i = 0; i < cadeiras.size(); i++) {
            Pessoa pessoa = cadeiras.get(i);
            if (pessoa != null && pessoa.id.equals(id)) {
                return pessoa;
            } 
        }
        return null;
    }

    void reservar(String id, String fone, int index){
        //verifica se o indice eh valido
        if (index < 0 || index >= cadeiras.size()) {
            System.out.println("ERRO: Index inválido");
            return;
        } 
        if (cadeiras.get(index) != null) {
            System.out.println("Meu cinema eh direito, não pode sentar no colo!");
            return;
        }
        if(this.find(id) != null){
            System.out.println("Você já comprou ingresso, seu gaiato!!");
            return;
        }
        cadeiras.set(index, new Pessoa(id, fone));
    }

    void cancelar(String id){
        int index = this.indexOf(id);
        if (index == -1) {
            System.out.println("Não existe reserva para esse id");
            return;
        }
        cadeiras.set(index, null);
    }

    public Sala(int tamanho){
        // cadeiras = new ArrayList<>(Collections.nCopies(tamanho, null));
        cadeiras = new ArrayList<>();
        for(int i = 0; i < tamanho; i++)
            cadeiras.add(null);
    }

    public String toString(){
        String saida = "[ ";
        for(Pessoa pessoa : cadeiras){
            if(pessoa == null)
                saida += "- ";
            else
                saida += pessoa + " ";
        }
        return saida + "]";
    }
}

public class Cinema{
    public static void main(String[] args) {

        Sala sala = new Sala(9);
        sala.reservar("Ruan", "85", -2);//erro
        sala.reservar("Ruan", "85", 9);//erro
        sala.reservar("Ruan", "85", 0);
        sala.reservar("Ariadne", "86", 1);

        sala.reservar("Iana", "87", 0);//erro ja tem alguem nessa cadeira
        sala.reservar("Iana", "87", 3);//erro ja tem alguem nessa cadeira
        
        sala.reservar("Ruan", "85", 3);//erro
        System.out.println(sala);

    }
}
