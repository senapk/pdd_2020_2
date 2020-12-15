import java.util.Scanner;

public class Tama{

    private int energy;
    private int energyMax;
    private int hungry;
    private int hungryMax;
    private int clean;
    private int cleanMax;
    private int diamantes;
    private int idade;
    private boolean vivo;
    
    Tama(int energyMax, int hungryMax, int cleanMax){
    
        this.energyMax = energyMax;
        this.hungryMax = hungryMax;
        this.cleanMax = cleanMax;
        
        this.energy = this.energyMax;
        this.hungry = this.hungryMax;
        this.clean = this.cleanMax;

        this.diamantes = 0;
        this.idade = 0;
        this.vivo = true;
    }
    
    void setEnergy(int value){
        
        this.energy=value;
        
        if(this.energy<=0){
            this.energy=0;
            this.vivo=false;
            System.out.println("Morreu por falta de energiia");
            return;
        }
        if(this.energy>this.energyMax){
            this.energy=this.energyMax;
        }
    }
    
    int getEnergy(){
        return this.energy;
    }
    
    void setHungry(int value){
      
        this.hungry=value;
        
        if(this.hungry<=0){
            this.hungry=0;
            this.vivo=false;
            System.out.println("Morreu por falta de fome");
            return;
        }
        if(this.hungry>this.hungryMax){
            this.hungry=this.hungryMax;
        }
    }
    
    int getHungry(){
        return this.hungry;
    }

    void setClean(int value){
        this.clean=value;
        
        if(this.clean<=0){
            this.clean=0;
            this.vivo=false;
            System.out.println("Morreu por falta de limpeza");
            return;
        }
                
        if(this.clean>this.cleanMax){
            this.clean=this.cleanMax;
        }  
        
    }
    
    int getClean(){
        return this.clean;
    }
    
    boolean estaVivo(){
        if(!vivo){
            System.out.println("Você não pode interagir! Ele morreu");
            return false;
        }
        return true;
    }
    
    void jogar(){
        if(!this.estaVivo())
            return;
                        
        this.diamantes+=1;
        this.idade+=1;
        setEnergy(energy-2);
        setHungry(hungry-1);
        setClean(clean-3);
    }
    void banhar(){
        
        if(!estaVivo())
            return;
            
        this.idade+=2;
        setEnergy(this.energy-3);
        setHungry(this.hungry-1);
        setClean(this.cleanMax);
        
    
    }
    
    void comer(){
        if(!estaVivo())
            return;
        this.idade+=1;
        setEnergy(this.energy-1);
        setHungry(this.hungry+4);
        setClean(this.clean-2);
    }
    
    void dormir(int t){
        if(!estaVivo())
            return;
        
        if(this.energy==this.energyMax-5){
            
            this.idade+=t;
            setEnergy(this.energyMax);
      
        }
        else{
            
            System.out.println("Não quero dormir");
             
        }
    
    }
    
    public String toString(){
        return "Sua energia é: " + energy + "/" + energyMax + " Sua fome é: " + hungry + "/" + hungryMax +  " Sua limpeza é: " + clean + "/" + cleanMax + " Seus diamantes " + diamantes; 
    }
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Tama tama = new Tama(0, 0, 0);
        while(true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){//_energia _saciedade _limpeza
                tama = new Tama(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]), 
                                Integer.parseInt(ui[3]));
            
            }else if(ui[0].equals("show")){
                System.out.println(tama);
            }else if(ui[0].equals("eat")){
                tama.comer();
            }else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
    
}
