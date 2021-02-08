// package agendaa;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.TreeMap;

// class Fone{
//     private String label;
//     private String number;
//     public Fone(String label, String number){
//         this.label=label;
//         this.number=number;
//     }
    
//     Fone(String serial){
//         String array[]= serial.split(":");
//         label=array[0];
//         number=array[1];
//     }
    
//     static public boolean validate(String number){
//         String validos = "0123456789()-";
//         for(int i = 0; i < number.length(); i++){
//             if(!validos.contains("" + number.charAt(i))){
//                 return false;
//             }
//         }
//         return true;
//     }
    
//     public String getLabel(){
//         return this.label;
//     }
    
//     public String getNumber(){
//         return this.number;
//     }
   
//     public String toString(){
//         return label + number;
//     }

// }

// class Contato{
//     private String name;
//     public boolean favorito;
//     private ArrayList<Fone> fones;

//     public Contato(String name){
//         this.name = name;
//         fones = new ArrayList<>();
//     }
    
//     public void addFone(String label, String number){
//         if(!Fone.validate(number)){
//             throw new RuntimeException("fail: esse número não é válido");
//         }
//         fones.add(new Fone(label, number));     
//     }

//     public void addFone(Fone fone){
//         this.addFone(fone.getLabel(), fone.getNumber());
//     }
    
//     public void rmFone(int index){
//         fones.remove(fones.get(index));      
//     }
    
//     public void setBookmark(boolean value){
//         this.favorito = value;
//     }
    
//     public String toString(){
//         return name;
//     }
// }


// class Agenda {

//     Map <String, Contato> contatos;
//     Map <String, Contato> bookmarks;

//     public Agenda(){
//         contatos = new TreeMap<>();
//         bookmarks = new TreeMap<>();
//     }
    
//     public void addContato(String name, List <Fone> fones){  //List <Fone> fones
//         if(!contatos.containsKey(name)){
//             contatos.put(name, new Contato(name));
//         }
//         Contato contato = contatos.get(name);
//         for(Fone fone : fones)
//             contato.addFone(fone);
//     }
    
//     public boolean rmContato(String name){
//         Contato contato = getContato(name);
//         contatos.remove(name);
//         bookmarks.remove(name);        
//     }
    
//     ArrayList <Contato> procurar(String padrao){
//         ArrayList<Contato> aux= new ArrayList<>();
//         for(Contato contato : contatos.values()){
//             if(contato.toString().contains(padrao)){
//                 aux.add(contato);
//                 return aux;
//             }
//         }
//         return null;
//     }
    
//     ArrayList <Contato> getContatos(){
//         return new ArrayList<Contato>(contatos.values());
//     }


//     Contato getContato(String name){
//         Contato contato = contatos.get(name);
//         if(contato == null)
//             throw new RuntimeException("fail: contato nao existe");
//         return contato;
//     }
//     public void bookmark(String id){
//         Contato contato = getContato(id);
//         if(!contato.favorito){
//             contato.setBookmark(true);
//             bookmarks.put(id, contato);
//         }
//     }
    
//     public void unBookmark(int id){
    
        
    
//     }
    
//     ArrayList <Contato> getBookmarks(){
    
//         return null;
//     }
    
//     public String toString(){
        
//         String saida ="[";
//                 saida += " " + contatos + " ";
//         return saida+="]" ;
    
//     }
    
//     public static void main(String[] args) {
        
//         Agendaa oi = new Agendaa();
        
//         oi.addContato("Pedro");
//         oi.addContato("Larah");
//         System.out.print(oi);
//         oi.getContato("Alde");
//         oi.getContatos();

        
//     }
    
// }
