import java.util.ArrayList;

class Pessoa {
    String nome;
    public Pessoa(String nome){
        this.nome = nome;
    }
    public String toString(){
        return "nome:" + nome;
    }
}

class Grupo{
    private String afinidade;
    private ArrayList<Pessoa> participantes;

    public Grupo(String afinidade){
        this.afinidade = afinidade;
        this.participantes = new ArrayList<>();
    }
    
    void addParticipante(Pessoa pessoa){
        participantes.add(pessoa);
    }

    public String toString() {
        String saida = afinidade + " [";
        for(int i = 0; i < participantes.size(); i++)
            saida += " " + i + ":" + participantes.get(i);
        return saida + " ]";
    }
}

public class Exemplo {
    public static void main(String[] args) {
        Grupo grupo = new Grupo("AmantesDoBrega");
        grupo.addParticipante(new Pessoa("David Sena"));
        grupo.addParticipante(new Pessoa("MaryAna"));
        grupo.addParticipante(new Pessoa("Pedro Falcao"));
        System.out.println(grupo);
    }
}
