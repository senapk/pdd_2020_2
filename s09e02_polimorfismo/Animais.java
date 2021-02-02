import java.util.ArrayList;

//muito mais flexivel
//menor acoplamento
interface Pet{ //apenas os contratos
    String getNome();
    void receberCarinho();
    void fazerBarulho();
}

//herança
//menos flexibilidade
//maior acoplamento
class PetBase{ //quais coisas
    String nome;  //atributo
    PetBase(String nome){ //construtor
        this.nome = nome;
    }
    public String getNome(){ //metodo
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}


//Dog: classe Derivada, classe filha, subclasse
//Pet: classe Base    , classe pai, superclasse
class Dog extends PetBase implements Pet{
    String latido;
    public Dog(String latido){
        super("cachorro");
        this.latido = latido;
    }
    void latir(){
        System.out.println(latido);
    }
    void correrAtrasDeBicicleta(){
        System.out.println("vou pegar voce seu ciclista do mal");
    }
    public void receberCarinho() {
        System.out.println("abano o rabo");
        this.nome = this.nome + "*";
    }
    public void fazerBarulho() {
        latir();
    }
}

class Cat extends PetBase implements Pet{
    // String name;
    public Cat(String name){
        super(name);
        // this.name = name;
    }
    void miar(){
        System.out.println("Miau");
    }
    // public String getNome() {
    //     return name;
    // }
    public void receberCarinho() {
        System.out.println("estou me esfregando na suas pernas");
        this.nome += "*";
    }
    public void fazerBarulho() {
        miar();
    }
}

class WildCat extends Cat{
    int ariscosidade;
    public WildCat(int ariscosidade){
        super("Chaninha");
        this.ariscosidade = ariscosidade;
    }
    public void receberCarinho(){
        if(this.ariscosidade > 0){
            System.out.println("estou fugindo de voce");
            this.ariscosidade -= 1;
        }else{
            super.receberCarinho();
        }
    }
    @Override
    public void setNome(String nome){
        if(this.ariscosidade > 0)
            System.out.println("voce nao eh meu dono");
        else
            super.setNome(nome);
    }
    public void miar(){
        if(this.ariscosidade > 0)
            System.out.println("Grrrrrrrrrrrr");
        else
            super.miar();
    }
}

public class Animais{
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Cat("Nanachi"));
        pets.add(new WildCat(2));
        pets.add(new Dog("aiaiaiaiai"));
        
        WildCat gato = new WildCat(2);
        gato.setNome("perola");
        gato.receberCarinho();
        gato.receberCarinho();
        gato.receberCarinho();
        gato.setNome("perola");
        System.out.println(gato.getNome());
        for(int i = 0; i < 5; i++){
            for(Pet pet : pets){
                System.out.println("Vem ca " + pet.getNome());
                pet.receberCarinho();
                pet.fazerBarulho();
                if(pet instanceof Dog){
                    Dog dog = (Dog) pet;
                    dog.correrAtrasDeBicicleta();
                }
                System.out.println("---------------");
            }
            System.out.println("############################");
        }
    }
}