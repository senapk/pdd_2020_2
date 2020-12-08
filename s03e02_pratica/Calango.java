
import java.util.Random;

class Inseto{
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

public class Calango{
    Inseto bucho;
    int energia;
    int maxEnergia;
    int nPatas;
    boolean estaVivo;
    boolean temRabo;
    boolean ehHomem;
    String nome;

    //parametros
    Calango(String nome, int energia, int nPatas, boolean ehHomem){
        this.nome = nome;
        this.energia = energia;
        this.maxEnergia = energia;
        this.nPatas = nPatas;
        this.estaVivo = true;
        this.temRabo = true;
        this.bucho = null;
        this.ehHomem = ehHomem;
    }

    void comer(Inseto inseto){
        if(bucho != null){
            System.out.println("Barriga ja esta cheia");
            return;
        }
        bucho = inseto;
    }

    Calango copular(Calango other){
        if(!this.estaVivo || !other.estaVivo){
            System.out.println("tem calango morto na historia");
            return null;
        }
        if(this.ehHomem == other.ehHomem){
            System.out.println("sao calangos do mesmo sexo");
            return null;
        }
        Random random = new Random();

        //Raf ael
        //Juli ana
        //rafana

        //metade do nome do pai com metade do nome da mãe
        String nome = this.nome.substring(0, this.nome.length()/2);
        nome += other.nome.substring(other.nome.length()/2);

        return new Calango(nome, random.nextInt(21) + 10, 4, random.nextBoolean());
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

    //metodo que informa como o meu objeto deve ser convertido para Texto
    public String toString() {
        return "Calango " + nome + " energia:" + energia + " patas:" + nPatas + " rabo:" + temRabo + " bucho:" + bucho;
    }

    public static void main(String[] args) { 
        Calango jeff = new Calango("Jeff", 20, 4, true);
        Calango karla = new Calango("Karla", 15, 3, false);
        Calango bebe = jeff.copular(karla);
        Calango bebe2 = karla.copular(jeff);
        System.out.println(bebe2);
    }
}
