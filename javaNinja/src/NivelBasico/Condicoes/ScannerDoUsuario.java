package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {
        //Scanner= É um jeito de trazer o usuário para dentro da aplicação
        //Obketivo= O usuário vai criar um ninja e vamos validar os dados

        //Abrir Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.println("Escreva o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //Receber a idade do ninja
        System.out.println("Escreva a idade do ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

        //Trtamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Ninja maior de idade, e pode sair em missões");

        } else {
            System.out.println("Ninja muito nova precisa treinar mais");
        }

        //Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
