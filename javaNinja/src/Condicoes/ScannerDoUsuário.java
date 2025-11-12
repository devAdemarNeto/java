package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuário {

    public static void main(String[] args) {
        /*
         * jeito de trazer o usuário para dentro da aplicação
         * Objetivo/; usuário vai criar o ninja e validar os dados
         * */

        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);



        // Receber a idade do ninja
        System.out.println("Escreva aqui a idade do seu ninja");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

        if (idadeDoNinja >= 18){
            System.out.println("Ninja é maior de idade!");

        } else {
            System.out.println("Ninja é menor de idade!!");
        }


        //Fechar a caixa de texto
        caixaDeTexto.close();
    }

}
