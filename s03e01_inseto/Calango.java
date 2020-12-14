enum Inseto{
    Mosca(1, 1), //constantes
    Barata(3, 10), 
    Caranguejeira(5, 200);

    int tamanho;
    int energia;

    Inseto(int tamanho, int energia){
        this.tamanho = tamanho;
        this.energia = energia;
    }
    public String toString() {
        return "T:" + this.tamanho + " E:" + this.energia;
    }
}

enum Mes{
    Janeiro("Janeiro", 1),
    Fevereiro("Fevereiro", 2);

    String nome; 
    int valor;

    Mes(String nome, int valor){
        this.nome = nome;
        this.valor = valor;
    }
    public String toString() {
        return nome + ":" + valor;
    }
}

enum Sexo{
    Masculino, Feminino;
}

public class Calango{
    Inseto bucho;
    int energia;
    int maxEnergia;
    int nPatas;
    boolean estaVivo;
    boolean temRabo;
    Sexo sexo;

    //parametros
    Calango(int energia, int nPatas, Sexo sexo){
        this.energia = energia;
        this.maxEnergia = energia;
        this.nPatas = nPatas;
        this.estaVivo = true;
        this.temRabo = true;
        this.bucho = null;
        this.sexo = sexo;
    }

    void comer(Inseto inseto){
        if(bucho != null){
            System.out.println("Barriga ja esta cheia");
            return;
        }
        bucho = inseto;
    }

    Inseto vomitar(){
        if(bucho == null){
            System.out.println("Barriga esta vazia");
            return null;
        }
        Inseto aux = bucho;
        bucho = null;
        return aux;
    }

    void digerir(){
        if(bucho == null){
            System.out.println("Barriga esta vazia");
            return;
        }
        this.energia += bucho.energia;
        bucho.energia = 0;
        bucho = null; //evacuo
    }



    boolean correr(int dist){
        if(!estaVivo){
            System.out.println("RIP ...");
            return false;
        }
        if(nPatas < 2){
            System.out.println("Estou temporariamente impossibilitado");
            return false;
        }
        if(energia > dist){
            System.out.println("Dando uma carreira");
            energia -= dist;
            return true;
        }
        System.out.println("Estou muito cansado para andar isso tudo");
        return false;
    }
    
    void brigar(Calango other){
        if(!this.estaVivo){
            System.out.println("RIP ...");
            return;
        }
        if(other.nPatas > 0){
            other.nPatas -= 1;
            System.out.println("Arranquei uma pata sua com meu jitsu");
        }else if(other.temRabo){
            other.temRabo = false;
            System.out.println("Arraquei seu rabo com meu dedo de quatro folhas");
        }else{
            other.estaVivo = false;
            System.out.println("Comi seu coração, agora você morreu");
        }
    }

    void regenerar(){
        if(!estaVivo){
            System.out.println("RIP ...");
            return;
        }
        if(nPatas < 4){
            nPatas += 1;
            System.out.println("RAPAZZ! Brotou uma pata!");
        }else if(!temRabo){
            temRabo = true;
            System.out.println("Estou de rabao novinho em folha");
        }else{
            System.out.println("Estou só o mi desbuiado, soh o fileh");
        }
    }

    public void engravidar(Calango macho){
        if(this.sexo != Sexo.Feminino){
            //erro esse calango eh macho
        }
        if(macho.sexo != Sexo.Masculino){
            //erro 
        }
    }

    //metodo que informa como o meu objeto deve ser convertido para Texto
    public String toString() {
        return "Calango : energia:" + energia + " patas:" + nPatas + " rabo:" + temRabo + " bucho:" + bucho;
    }

    public static void main(String[] args) { 
        Calango jeff = new Calango(20, 4, Sexo.Masculino);
        jeff.correr(10);
        System.out.println(jeff);
        Calango karl = new Calango(15, 3, Sexo.Feminino);

        jeff.brigar(karl);
        jeff.brigar(karl);
        jeff.brigar(karl);
        jeff.brigar(karl);
        System.out.println(karl);

        //karl lango fugiu
        Inseto murrissokka = Inseto.Mosca;
        karl.comer(murrissokka);
        System.out.println(karl);
        karl.digerir();
        karl.regenerar();
        karl.regenerar();
        System.out.println(karl);
        jeff.correr(10);
        Inseto barataCascuta = Inseto.Barata;
        karl.comer(barataCascuta);
        Inseto fugitivo = karl.vomitar();

        System.out.println(karl);
        System.out.println(jeff);

        jeff.comer(fugitivo);
        karl.comer(fugitivo);
        jeff.digerir();
        karl.digerir();

        System.out.println(karl);
        System.out.println(jeff);   
    }
}
