package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Arrays são estaticos
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        //Printando array
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Ninja " + (i+1) + ":" + ninjasArray[i]);

        }


        //Listas não são estaticas

        List<String> ninjasList = new ArrayList<>();

        //Adicionando elemento
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uciha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        //printando List
        System.out.println(ninjasList);

        //Removendo elemento
        ninjasList.remove("Tobirama Senju");
        System.out.println(ninjasList);

        //Substituir elemento
        ninjasList.set(3, "Hinata Hyuga");
        System.out.println(ninjasList);

        //Verificar o tamanho da lista
        System.out.println("Tamanho da lista = " + ninjasList.size());






    }
}
