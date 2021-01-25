/*
class Topic{
    ArrayList<Pessoa> cadnorm;
    ArrayList<Pessoa> cadpref;

    int procuraVaga(ArrayList<Pessoa> cadeiras){
        for(int i = 0; i < cadeiras.size(); i++)
            if(cadeiras.get(i) == null)
                return i;
        return -1;        
    }

    boolean sentar(ArrayList<Pessoa> cadeiras, Pessoa p){
        int ind = procuraVaga(cadeiras);
        if(ind == -1)
            return false;
        cadeiras.set(ind, p);
    }

    void entrar(Pessoa p){
        if(p.ehPreferencial()){
            if(!sentar(cadpref, p) && !sentar(cadnorm, p))
                 System.out.println("Nao tem vaga");
            
            boolean conseguiuSentar = sentar(cadpref, p);
            if(!conseguiuSentar)
                conseguiuSentar = sentar(cadnorm, p);
            if(!conseguiuSentar)
                System.out.println("lotado");
            
        }else {
            if(!sentar(cadnorm, p))
                if( !sentar(cadpref, p))
                    System.out.println("Nao tem vaga");
        }
    }

    void removerPessoa(String id){
        if(!remover(cadpref, id) && !remover(cadnorm, id))
            System.out.println("pessoa nao esta na topic");
    }
    
}
*/