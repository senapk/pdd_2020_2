import java.util.Scanner;


class Calculadora{
    int bateria = 2;
    void recarregar(int value){
        this.bateria += value;
    }

    void gastarBateria(){
        if(bateria == 0)
            throw new RuntimeException("fail: bateria acabou");
        bateria -= 1;
    }

    float dividir(int a, int b){
        if(b == 0)
            throw new ArithmeticException("fail: divisao por 0");
        gastarBateria();
        return (float) a / b;
    }
}

public class Solver{
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                String line = scanner.nextLine();
                String[] ui = line.split(" ");
                if(ui[0].equals("end")){
                    break;
                }else if(ui[0].equals("charge")){
                    calc.recarregar(Integer.parseInt(ui[1]));
                }else if(ui[0].equals("div")){
                    int a = Integer.parseInt(ui[1]);
                    int b = Integer.parseInt(ui[2]);
                    System.out.println(calc.dividir(a, b));
                }else{
                    System.out.println("fail: comando invalido");
                }
            }catch(IndexOutOfBoundsException e){
                System.out.println("fail: atencao aos parametros");
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}