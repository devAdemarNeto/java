package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do ninja: ");
        String nomeNinja = scanner.nextLine();
        System.out.println("Nome do ninja: " + nomeNinja);

        System.out.println("Digite a idade do ninja: ");
        int idadeNinja = scanner.nextInt();
        System.out.println("Idade do ninja: " + idadeNinja);

        scanner.close();
    }
}
