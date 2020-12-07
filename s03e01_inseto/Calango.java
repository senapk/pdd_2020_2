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

    //parametros
    Calango(int energia, int nPatas){
        this.energia = energia;
        this.maxEnergia = energia;
        this.nPatas = nPatas;
        this.estaVivo = true;
        this.temRabo = true;
        this.bucho = null;
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

    //metodo que informa como o meu objeto deve ser convertido para Texto
    public String toString() {
        return "Calango : energia:" + energia + " patas:" + nPatas + " rabo:" + temRabo + " bucho:" + bucho;
    }

    public static void main(String[] args) { 
        Calango jeff = new Calango(20, 4);
        jeff.correr(10);
        System.out.println(jeff);
        Calango karl = new Calango(15, 3);

        jeff.brigar(karl);
        jeff.brigar(karl);
        jeff.brigar(karl);
        jeff.brigar(karl);
        System.out.println(karl);

        //karl lango fugiu
        Inseto murrissokka = new Inseto(1, 3);
        karl.comer(murrissokka);
        System.out.println(karl);
        karl.digerir();
        karl.regenerar();
        karl.regenerar();
        System.out.println(karl);
        jeff.correr(10);
        Inseto barataCascuta = new Inseto(20, 50);
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
