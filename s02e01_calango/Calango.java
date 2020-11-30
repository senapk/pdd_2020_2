
public class Calango{
    int energia; //atributo -> estado
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
    }


    void correr(){ //métodos -> comportamento
        if(nPatas < 2){
            System.out.println("Estou temporariamente impossibilitado");
            return;
        }
        if(energia > 0){
            System.out.println("Dando uma carreira");
            energia -= 1;
        }else{
            System.out.println("Estou muito cansado");
        }
    }
    void brigar(){
        if(nPatas > 0){
            nPatas -= 1;
            System.out.println("Arri egua, perdi uma pata");
        }else{
            System.out.println("Só se me levar o rabo agora!");
        }
    }

    void regenerar(){
        if(nPatas < 4){
            nPatas += 1;
            System.out.println("RAPAZZ! Brotou uma pata!");
        }else{
            System.out.println("Já tenho 4 patinhas fofinhas");
        }
        
    }

    void descansar(int turnos){
        System.out.println("Descansando!");
        energia += turnos;

        if(energia > maxEnergia)
            energia = maxEnergia;
    }

    //metodo que informa como o meu objeto deve ser convertido para Texto
    public String toString() {
        return "Calango : energia:" + energia + " patas:" + nPatas;
    }

    public static void main(String[] args) { 
        //tipo nome_da_referencia;
        Calango deadpool = new Calango(10, 8);
        System.out.println(deadpool);

        for(int i = 0; i < 50; i++)
            deadpool.correr();
        
        System.out.println(deadpool);
        deadpool.descansar(60);
        System.out.println(deadpool);


        deadpool.regenerar();
        deadpool.regenerar();
        deadpool.regenerar();
        deadpool.regenerar();
        System.out.println(deadpool);
    }
}
