class Camaleao extends Tixa{
    int camuflagem;
    int escudo;
    public Camaleao(){
        this.camuflagem = random.nextInt(60);
        this.escudo = random.nextInt(30);
    }

    @Override
    public String getNome(){
        return "🌈" + nome;
    }

    public void receiveDamage(int damage, Player other){
        if(random.nextInt(100) < this.camuflagem)      
            System.out.print(" Você não me viu, escapei");
        else{
            if(escudo > 0){
                System.out.print(" Defendendo com meu escudo");
                escudo -= damage;
            }else
                this.vida -= damage;
        }
    }

    @Override
    public String toString(){
        return super.toString() + ":" + camuflagem + ":" + escudo;
    }
}