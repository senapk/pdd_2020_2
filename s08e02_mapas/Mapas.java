// import java.security.KeyStore.Entry;
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Map;
// import java.util.TreeMap;

// class Pessoa {
//     String nome;
//     Pessoa(String nome){
//         this.nome = nome;
//     }
//     public String toString() {
//         return nome;
//     }
// }

//  public class Mapas {
//     public static void main(String[] args) {
//         List<Pessoa> pessoas = new ArrayList<Pessoa>();
//         pessoas.add(new Pessoa("Vanessa"));

//         Map<String, Pessoa> apelidos = new TreeMap<>();
//         apelidos.put("vivi", new Pessoa("David"));
//         apelidos.put("lagartixa", new Pessoa("Luis"));
//         apelidos.put("travesseiro", new Pessoa("Leticia"));
//         apelidos.put("cabiludo", new Pessoa("Wermyson"));

//         System.out.println(apelidos);

//         if(apelidos.containsKey("vivi")){
//             System.out.println("Essa pessoa ja esta cadastrada");
//         }
//         for(String key : apelidos.keySet())
//             System.out.println(key);

//         for(Pessoa pessoa: apelidos.values())
//             System.out.println(pessoa);

//         for(Map.Entry<String, Pessoa> entry : apelidos.entrySet())
//             System.out.println(entry.getKey() + ":" + entry.getValue());
//     }
// }