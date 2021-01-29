// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// class Pessoa {
//     String nome;
//     Pessoa(String nome){
//         this.nome = nome;
//     }
//     public String toString() {
//         return nome;
//     }
// }

// class ComparaPorNome implements Comparator<Pessoa>{
//     public int compare(Pessoa arg0, Pessoa arg1) {
//         return arg0.nome.compareTo(arg1.nome);
//     }
// }

// class Agenda{
//     ArrayList<Pessoa> lista;
//     public Agenda(){
//         lista = new ArrayList<>();
//     }
//     public void add(String nome){
//         lista.add(new Pessoa(nome));
//         Collections.sort(lista, new ComparaPorNome());
//     }
//     public String toString() {
//         return lista.toString();
//     }

//     public ArrayList<Pessoa> search(String pattern){
//         ArrayList<Pessoa> aux = new ArrayList<>();
//         for(Pessoa pessoa : lista)
//             if(pessoa.toString().contains(pattern))
//                 aux.add(pessoa);
//         return aux;
//     }
// }

// public class Revisao{ //então quando a gente chama o comparador pra lista a gente ja esta dizendo que quer orgnaizar ela inteira?
//     public static void main(String[] args) {
//         Agenda ag = new Agenda();
//         ag.add("luan");
//         ag.add("vanessa");
//         ag.add("bruna");
//         ag.add("caio");
//         ag.add("camila");
//         ag.add("carol");
//         System.out.println(ag);   
//         System.out.println(ag.search("ca"));     
//     }
// }