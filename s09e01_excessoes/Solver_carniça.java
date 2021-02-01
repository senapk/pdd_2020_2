// import java.util.Scanner;

// class Resultado {
//     boolean sucesso;
//     float value;
//     Resultado(boolean sucesso, float value){
//         this.sucesso = sucesso;
//         this.value = value;
//     }
// }

// class Calculadora{
//     int bateria = 2;
//     void recarregar(int value){
//         this.bateria += value;
//     }

//     boolean gastarBateria(){
//         if(bateria == 0){
//             return false;
//         }
//         bateria -= 1;
//         return true;
//     }

//     Resultado dividir(int a, int b){
//         if(b == 0){
//             return new Resultado(false, 0);
//         }
//         if(!gastarBateria())
//             return new Resultado(false, 1);
//         return new Resultado(true, (float) a / b);
//     }
// }

// public class Solver{
//     public static void main(String[] args) {
//         Calculadora calc = new Calculadora();
//         Scanner scanner = new Scanner(System.in);
//         while(true){
//             String line = scanner.nextLine();
//             String[] ui = line.split(" ");
//             if(ui[0].equals("end")){
//                 break;
//             }else if(ui[0].equals("charge")){
//                 calc.recarregar(Integer.parseInt(ui[1]));
//             }else if(ui[0].equals("div")){
//                 int a = Integer.parseInt(ui[1]);
//                 int b = Integer.parseInt(ui[2]);
//                 Resultado res = calc.dividir(a, b);
//                 if(res.sucesso)
//                     System.out.println(res.value);
//                 else{
//                     if(res.value == 0){
//                         System.out.println("Erro de divisao por 0");
//                     }else if(res.value == 1){
//                         System.out.println("Bateria acabou");
//                     }else{
//                         System.out.println("Erro desconhecido");
//                     }
//                 }
//             }else{
//                 System.out.println("fail: comando invalido");
//             }
//         }
//         scanner.close();
//     }
// }