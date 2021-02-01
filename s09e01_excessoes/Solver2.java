import java.util.ArrayList;

public class Solver2 {
    static int fn(int a){
        if(a == 0)
            throw new ArithmeticException("'a' nao pode ser zero");
        System.out.println("imprimindo a em fn " + a);
        return 0;
    }
    public static void main(String[] args) {
        try{
            fn(0);
            ArrayList<String> array = new ArrayList<String>();
            System.out.println(array.get(2));
        }catch(IndexOutOfBoundsException e){
            System.out.println("Nao existe essa posicao");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Alguma errada nao esta certo");
        }
    }
}
