package SintaxeBasica;

import java.util.ArrayList;

public class D_ArrayList {
    public static void main(String[] args) {
        //ArraysList = apresenta uma lista dinamica, podemos adicionar e remover elementos sem declarar o tamanho da lista
        //ArrayList<String> nomes = new ArrayList<>();

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");//adiciona valores no ArrayList
        nomes.add("Ademar");
        nomes.remove(0);//Remove valores do ArrayList
        System.out.println(nomes.get(0));//acessa os valores do ArrayList




        for (int j = 0; j < nomes.size(); j++) {
            System.out.println(nomes.get(j));
        }
    }
}
