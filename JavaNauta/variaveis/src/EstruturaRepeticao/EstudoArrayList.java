package EstruturaRepeticao;

import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {

    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarão");

        listaDeCompras.add(1,"Banana");

        for (String item : listaDeCompras){
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho: " + item);

        listaDeCompras.remove("Sabão em pó");

        for (String item2 : listaDeCompras){
            System.out.println(item2);
        }

        boolean eVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");
        System.out.println(eVazia + "" + tamanho + "" + contem);
        listaDeCompras.clear();

        listaDeCompras.forEach(produto -> System.out.println(produto));




    }



}
