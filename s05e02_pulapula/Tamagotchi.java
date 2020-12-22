import java.util.Scanner;

public class Tamagotchi{
    private int energia;
    private int energiaMax;
    private int hungry;
    private int hungryMax;
    private int clean;
    private int cleanMax;
    private int age;
    private int diamonds;
    private boolean alive = true;
               //   10
    Tamagotchi(int energiaMax, int hungryMax, int cleanMax){
        this.energiaMax = energiaMax;
        this.energia = this.energiaMax;
        this.hungryMax = hungryMax;
        this.hungry = this.hungryMax;
        this.cleanMax = cleanMax;
        this.clean = this.cleanMax;
        this.age = 0;
        this.diamonds = 0;
        this.alive = true;
    }


    private void setEnergia(int valor){
        if(valor > energiaMax){
            this.energia = energiaMax;
        }else if(valor <= 0){
            this.energia = 0;
            this.alive = false;
            System.out.println("Morreu de cansaço!");
        }else{
            this.energia = valor;
        }
    }

    int getEnergia(){
        return this.energia;
    }

    private void setHungry(int valor){
        if(hungry == hungryMax){
            this.hungry = hungryMax;
        }
        if(hungry <= 0){
            this.hungry = 0;
            this.alive = false;
            System.out.println("Morreu de fome!");
        }
    }

    int getHungry(){
        return this.hungry;
    }

    private void setClean(int valor){
        if(clean == cleanMax){
            this.clean = cleanMax;
        }
        if(clean <= 0){
            this.clean = 0;
            this.alive = false;
            System.out.println("Morreu de sujeira!");
        }
    }

    int getClean(){
        return this.clean;
    }

    boolean estaAlive(){
        if (alive){
            return true;
        } else{
            System.out.println("Bichinho morto,não pode interagir");
            return false;
        }
    }

    public void play(){
        if(alive){
            setEnergia(this.energia - 1);
            age += 1;
            setHungry(this.hungry - 1);
            setClean(this.clean - 3);
            diamonds += 1;
        }
    }

    public void shower(){
        if(alive){
            setEnergia(this.energia - 3);
            setHungry(this.hungry - 1);
            setClean(this.clean = cleanMax);
            age +=2;
        }
    }

    public void eat(){
        if(alive){
            setEnergia(this.energia - 1);
            setHungry(this.hungry + 4);
            setClean(this.clean + 2);
            age +=1;
        }
    }

    public void sleep(int time){
        if(alive){
            age += time;
            setEnergia(this.energia = energiaMax);

        }
    }

    public String toString(){
        return "E:" + energia +"/" + energiaMax + " S:" + hungry +"/" + hungryMax + " L:" + clean + "/" + cleanMax + 
        " D:" + diamonds + " I:" + age;
    }

}

class game{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Tamagotchi pet = new Tamagotchi(0, 0, 0);
        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                break;

            }else if(ui[0].equals("Pet")){
                pet = new Tamagotchi(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]), Integer.parseInt(ui[3]));
                System.out.println(pet);

            }else if(ui[0].equals("Brincar")){
                pet.play();
                System.out.println(pet);

            }else if(ui[0].equals("Banho")){
                pet.shower();
                System.out.println(pet);

            }else if(ui[0].equals("Comer")){
                pet.eat();
                System.out.println(pet);

            }else if(ui[0].equals("Dormir")){
                pet.sleep(Integer.parseInt(ui[1]));
                System.out.println(pet);

            }else if(ui[0].equals("show")){
                System.out.println(pet);

            }else{
                System.out.println("Comando invalido");
            }
        }
        scanner.close();
    }
}

