
public class Calango{
    int energia = 2; //atributo -> estado
    int nPatas = 4;

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
        
    }

    void descansar(){
        System.out.println("Descansando!");
        energia += 1;
    }

    //metodo que informa como o meu objeto deve ser convertido para Texto
    public String toString() {
        return "Calango : energia:" + energia + " patas:" + nPatas;
    }

    public static void main(String[] args) { 
        //tipo nome_da_referencia;
        Calango deadpool = new Calango(); //energia 2
        deadpool.descansar();
        deadpool.descansar();
        deadpool.descansar();
        System.out.println(deadpool); //energia 5

        deadpool.correr();//energia 4
        deadpool.brigar();//3
        deadpool.correr();//energia 3
        deadpool.brigar();//2
        deadpool.correr();//energia 2, patas 2
        deadpool.brigar();//
        deadpool.correr();//nao corre, pois so tem uma pata
        System.out.println(deadpool); //energia 3, 1 pata
        deadpool.brigar();
        deadpool.brigar();
        deadpool.brigar();
    }
}
