import java.util.Scanner;
public class Solver {
    public static void main(String[] args) {
        System.out.println("A" == "A"); //false
        System.out.println("A" == new String("A")); //false
        System.out.println("A".equals(new String("A")));//true
        
    }
}