package SintaxeBasica;

import java.util.ArrayList;

public class E_Loops {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");//adiciona valores no ArrayList
        nomes.add("Ademar");

        //loops:
        //for-para
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        for (String nome : nomes){
            System.out.println(nome);
        }


        //while-enquanto
        int contador = 0;
        while (contador < 10){
            System.out.println("Estou no while");
            contador++;
        }
    }

}
