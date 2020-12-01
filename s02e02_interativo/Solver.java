import java.util.Scanner;
public class Solver {
    public static void main(String[] args) {
//true - mesma entrada na tabela de constantes
System.out.println("A" == "A");

//false - objetos diferentes
System.out.println("A" == new String("A"));

//true - mesmo conteúdo
System.out.println("A".equals(new String("A")));
        
    }
}