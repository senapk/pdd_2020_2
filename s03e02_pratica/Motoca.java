class Pessoa {//so pode uma classe publica por arquivo
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() { 
        return "Nome: " + nome + " | " + "Idade: " + idade;
    }

}

public class Motoca{
    int potencia;
    int tempo;
    Pessoa pass;

    Motoca(int potencia, int tempo) {
        this.potencia = potencia;
        this.tempo = tempo;
        this.pass = null;//importante inicializar TUDO
    }

    void subir(Pessoa pessoa) {
        if(pass == null) {
            pass = pessoa;
            System.out.println(pessoa.nome + " Subiu na moto!");
        } else {
            System.out.println("Já tem uma pessoa na moto!");
        }
    }

    Pessoa descer(){
        if (pass == null) {
            System.out.println("Não tem ninguem na moto!");
            return null;
        } else {
            Pessoa aux = pass;
            pass = null;
            System.out.println("SAI DESGRAÇA!!");
            return aux;
        }
    }

    void comprarTempo(int tempo){
        this.tempo += tempo;//moleza
        System.out.println("Adicionou-se " + tempo + " minutos ao tempo da motoca!");
    }
    
    void dirigir(int tempo){ //go go go go go
        if (this.pass == null) {
            System.out.println("não tem ngm na moto");
        } else if (pass.idade > 10 ){
            System.out.println("vc já eh bem grandinho pra isso");
        } else if (this.tempo >= tempo) {
            this.tempo -= tempo;
            System.out.println("Você andou por " + tempo + " minutos!");
        } else {
            System.out.println("Você não tem tempo suficiente.");
        }
    }

    String buzinar(){
        String pem = "p";
        for (int i = 0; i < potencia; i++)
            pem += "e";
        pem += "m";
        return pem;
    }

    public static void main(String[] args) {
        Motoca moto = new Motoca(4, 10);
        moto.comprarTempo(10);
        moto.subir(new Pessoa("Jeff", 7));
        Pessoa rainara = new Pessoa("Rainara", 5);
        moto.subir(rainara);
        Pessoa jeff = moto.descer();
        moto.subir(rainara);
        System.out.println(moto.buzinar());
        moto.dirigir(8);
        System.out.println(moto.descer());
        moto.subir(new Pessoa("David", 36));
        moto.dirigir(1);//vei
        moto.descer();
        moto.dirigir(1);//sem ninguem
    }
}
















