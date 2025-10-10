package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        //Pedir para o usuário escolher um ninja

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - SasukeSakura");
        System.out.println("3 - Sakura");

        int escolhaUsuario = scanner.nextInt();
        System.out.println("Você digitou o numero: " + escolhaUsuario);

        switch (escolhaUsuario){
            case 1:
                System.out.println("Usuário escolheeu Naruto");
                break;
            case 2:
                System.out.println("Usuário escolheeu Sasuke");
                break;
            case 3:
                System.out.println("Usuário escolheeu Sakura");
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");

        }

        scanner.close();
    }


}
