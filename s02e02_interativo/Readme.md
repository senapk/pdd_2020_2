# Escrevendo código interativo

## Lendo variáveis em java

```java
import java.util.Scanner;
public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um int, float, string e uma frase");
        int a = scanner.nextInt(); //int
        float b = scanner.nextFloat();
        String word = scanner.next();
        String line = scanner.nextLine();
        System.out.println(a + " " + b + " " + word);
        System.out.println(line);
        scanner.close();
    }
}
```

## Somando todos os números até digitar -1
```java
import java.util.Scanner;
public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acc = 0;
        while(true){
            int a = scanner.nextInt();
            if(a == -1)
                break;
            acc += a;
        }
        System.out.println(acc);
        scanner.close();
    }
}
```
## Somando todos os números de uma linha

### Quebrando uma linha em um vetor de palavras
```java
String line = "hoje nos vamos a praia";
String[] words = line.split(" ");//["hoje", "nos", "vamos", "a", "praia"]
System.out.println(words.length);//5
System.out.println(words[0]);//hoje
```
### Convertendo strings
```java
int a = Integer.parseInt("312");
float f = Float.parseFloat("-4.31");
```

## Imprimindo um vetor
```java
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
```

## Juntando

```java
    String line = scanner.nextLine();//lê uma linha inteira
    String[] words = line.split(" ");//separa em um vetor de palavras
    //words.length guarda o tamanho do vetor
    int acc = 0;
    //Integer.parseInt(value) converte de string para inteiro
    for(int i = 0; i < words.length; i++)
        acc += Integer.parseInt(words[i]); //words[i] pega o elemento i
    System.out.println(acc);
```

## Mini Modelo Interativo

```java
import java.util.Scanner;
public class Mago{
    String name;
    Mago(String name){
        this.name = name;
    }
    public String toString() {
        return "Nome: " + this.name;
    }
    public static void main(String[] args) {
        Mago mago = new Mago("Patolino");
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){//init _nome
                mago = new Mago(ui[1]);
            }else if(ui[0].equals("show")){
                System.out.println(mago);
            }else{
                System.out.println("Comando invalido");
            }
        }
        scanner.close();
    }
}

```