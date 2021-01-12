import java.util.ArrayList;

public class Cinema {
    
    public static void imprime(ArrayList<String> clientes){
        System.out.print("[ ");
        for(String cliente : clientes){
            if(cliente != null)
                System.out.print(cliente + " ");
            else
                System.out.print("- ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int size = 10;
        ArrayList<String> clientes = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            clientes.add(null);
        }

        imprime(clientes);
        
        //inserir
        clientes.set(4, "David");
        clientes.set(5, "Ticiany");
        
        //cadeira 11
        int posicao = 11;
        if(posicao < 0 || posicao >= clientes.size())
            System.out.println("cadeira nao existe");

        imprime(clientes);

        //verificar se esta vazio
        if(clientes.get(4) == null)
            System.out.println("cadeira vazia");
        else
            System.out.println("cadeira ocupada");

        //procurar
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i) != null && 
               clientes.get(i).equals("Ticiany")){ //null pointer exception
                System.out.println("Achei");
            }
        }
        System.out.println("não encontrei a pessoa");


        //remove a pessoa da cadeira 4
        clientes.set(4, null);
        imprime(clientes);


    }
}
