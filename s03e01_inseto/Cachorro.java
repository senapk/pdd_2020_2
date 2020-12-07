import java.util.Scanner;

public class Cachorro {
	int felicidade = 0;
	int energia = 0;
	int idade = 0;
	int lacinhos = 0;
	int lacinhomax = 10;
	
	Cachorro(int idade){
		this.idade = idade;
	}
	
	void brincar () {
		if(energia == 0) {
			System.out.println("não vai dar não minha filha");
			return;
		}
		else {
			System.out.println("AAAAAA eu amo brincar :P");
			felicidade +=1;
			energia -=1;
			lacinhos -=1;
			idade +=1;
		}
	}
	
	void descansar (int horas) {
		energia += horas;
		felicidade += horas;
		idade +=1;
		System.out.println("hmmmm a mimir");
	}
	
	void enfeitar (int lacinho) {
		if (felicidade == 0) {
			System.out.println("EU VOU TE MORDEEEE");
		} else if (lacinho > 10){
			System.out.println("NAAOO CABEEEE");
		} else if ((this.lacinhos + lacinho) > lacinhomax){
			System.out.println("não tem mais espaço!! não tá vendo??");
		} else {
			this.lacinhos += lacinho;
			System.out.println("vou deixar, mas só um hein...");
		}
	}
	
	
	void brincarLoucamente () {
		if(idade > 15) {
			System.out.println("olha moça, não tenho mais idade pra isso");
			return;
		}
		lacinhos = 0;
		energia = 0;
		felicidade +=10;
		idade +=1;
		System.out.println("MODO TUUUURBOOOO");
	}
	
	public String toString(){
		String saida = "Aqui vão meus status!\n";
		saida += "minha energia:" + energia + "\n";
		saida += "meu nível de felicidade:" + felicidade + "\n";
		saida += "minha idade:" + idade + "\n";
		saida += "meus lacinhos:" + lacinhos + "\n";
		return saida;
	}
	
	//public String toString() {
	//	return "minha energia:" + energia + "meu nível de felicidade:" + felicidade;
	//}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cachorro perola = new Cachorro(1);
		System.out.println("--- Bem vindo!!---");
		System.out.println("eu sou Pérola, uma catiorinea!");
		System.out.println("aqui vai o menu <3");
		System.out.println("Digite o que fazer em seguida:");
		System.out.println("brincar -  vamos brincar e eu vou ficar bem feliz");
		System.out.println("descansar (horas) - vou ficar feliz tbm, mas dormindo ");
		System.out.println("enfeitar - vc coloca lacinhos em mim e eu te mordo ");
		System.out.println("turbo - o que pode acontecer é um mistério...");
		
		
		while(true) {
			String line = scanner.nextLine();
			String input[] = line.split(" ");
			if (input[0].equals("end")) {
				System.out.println("é isso. acabou. boa sortee...");
				break;
			}
			
			else if (input[0].equals("brincar")) {
				perola.brincar();
				System.out.println(perola);
			}
			
			else if (input[0].equals("descansar")) {
				int horas = Integer.parseInt(input[1]);
				perola.descansar(horas);
				System.out.println(perola);
			}
			
			else if (input [0].equals("enfeitar")) {
				int lacinho = Integer.parseInt(input[1]);
				perola.enfeitar(lacinho);
				System.out.println(perola);
			}
			
			else if (input [0].equals("turbo")) {
				perola.brincarLoucamente();
				System.out.println(perola);
			}
		}
		scanner.close();
	}	
}