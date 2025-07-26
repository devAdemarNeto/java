import java.util.ArrayList;

public class Aula5ArraysListasArrayListExemplo {
    public static void main(String[] args) {
        ArrayList<String> jutsus = new ArrayList<>();
        //Adicionando jutsus à lista
        jutsus.add("Rasegan");
        jutsus.add("Chidori");
        jutsus.add("Fuuton: Rasen Shuriken");

        //Acessando elementos
        System.out.println("Primeiro jutsu: " + jutsus.get(0));

        //Tamanho da lista

        System.out.println("Você conhece " + jutsus.size() + " jutsus");

        //Percorrendo todos os jutsus

        for (String jutsu : jutsus){
            System.out.println("Jutsu: " + jutsu);
        }

//
//        Métodos úteis do ArrayList
//        Método	          O que faz
//        .add(elemento)	  Adiciona um novo item no final da lista
//        .get(índice)	       Retorna o item da posição desejada
//        .size()	           Retorna quantos itens tem na lista
//        .remove(índice)	   Remove um item pelo índice
//        .clear()	           Remove todos os itens da lista
//        .contains(valor)	   Verifica se um item existe na lista (true ou false)
    }
}
