package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        * SwitcheCase: Que sevem para gerar casos especificos
        * Objetivo: Pedir para o usuário escolher entre os ninjas
        * */

        //Pedrir para o usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("1 - Sakura Haruno");


        //Pedir para o usuário
        int escolhaDoUsusario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " +  escolhaDoUsusario);

        switch (escolhaDoUsusario){
            case 1:
                System.out.println("Usuário escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Usuário escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Usuário escolheu Sakura Haruno");
                break;
            default:
                System.out.println("Opção inválida");


        }




        //Fechar scanner
        scanner.close();
    }
}
