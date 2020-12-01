import java.util.Scanner;
import java.util.Arrays;
public class Solver {
    public static void main(String[] args) {
        String line = "hoje nos vamos a praia";
        String[] words = line.split(" ");//["hoje", "nos", "vamos", "a", "praia"]
        
        //modo manual
        System.out.print("[ "); //não é o println
        for(int i = 0; i < words.length; i++)
            System.out.print(words[i] + " "); //não é o println
        System.out.println("]");

        //modo automatico
        //import java.util.Arrays;
        //Arrays.asList convert de String[] para ArrayList
        System.out.println(Arrays.asList(words));
    }
}