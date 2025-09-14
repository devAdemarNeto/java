package LogicaSequancial;

import java.util.Scanner;

public class EntradaESaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Faz a impressão e pula uma linha");
        System.out.print("Faz a impressão na mesmo linha");
        System.out.printf("Faz a impressão formatada");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);
    }
}
