
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
        }else if(temRabo){
            temRabo = false;
            System.out.println("Perdi meu rabo, ouch!!!");
        }else{
            estaVivo = false;
            System.out.println("Adeus mundo cruel");
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

    void descansar(int turnos){
        System.out.println("Descansando!");
        energia += turnos;

        if(energia > maxEnergia)
            energia = maxEnergia;
    }

    //metodo que informa como o meu objeto deve ser convertido para Texto
    public String toString() {
        return "Calango : energia:" + energia + " patas:" + nPatas + " rabo:" + temRabo;
    }

    public static void main(String[] args) { 
        //tipo nome_da_referencia;
        Calango deadpool = new Calango(10, 4);
        for(int i = 0; i < 5; i++){
            deadpool.brigar();
            System.out.println(deadpool);
        }

        for(int i = 0; i < 5; i++){
            deadpool.regenerar();
            System.out.println(deadpool);
        }
        
    }
}
