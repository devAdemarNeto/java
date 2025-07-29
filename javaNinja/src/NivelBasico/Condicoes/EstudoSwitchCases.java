package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        //SwitchCases: Servem para gerar casos especificos
        //Objetivo: Pedir para o usuário escolhar entre os ninjas


        //Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        //Mostrar opções para usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        //Pedir para o usuário escolher uma
        int escolhaDoUsuario  = scanner.nextInt();
        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        //Reacao ao escolher um usuário
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Usuário escolheu Naruto ");
                break;
            case 2:
                System.out.println("Usuário escolheu Sasuke ");
                break;
            case 3:
                System.out.println("Usuário escolheu Sakura ");
                break;
            default:
                System.out.println("Opção invalida, Tente novamente");
        }
        scanner.close();
    }
}
