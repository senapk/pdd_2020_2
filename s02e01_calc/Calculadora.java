import java.util.Scanner;
public class Calculadora {
    int bateria; //atributo
    int bateriaMax;

    Calculadora(int bateriaMax){
        this.bateria = bateriaMax;
        this.bateriaMax = bateriaMax;
    }

    public String toString() {
        return "Bateria: " + this.bateria + "/" + bateriaMax;
    }
    void soma(int x, int y){
        if(this.bateria > 0){
            System.out.println(x + y);
            bateria -= 1;
        }else{
            System.out.println("Bateria acabou");
        }
    }

    void carregarBateria(int qtd){
        this.bateria += qtd;
        if(this.bateria > this.bateriaMax)
            this.bateria = this.bateriaMax;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(0);
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");

            if(line.equals("end")){
                break;
            }else if(ui[0].equals("init")){
                calc = new Calculadora(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("show")){
                System.out.println(calc);
            }else if(ui[0].equals("soma")){
                int n1 = Integer.parseInt(ui[1]);
                int n2 = Integer.parseInt(ui[2]);
                calc.soma(n1, n2);
            }else if(ui[0].equals("charge")){
                calc.carregarBateria(Integer.parseInt(ui[1]));
            }else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}