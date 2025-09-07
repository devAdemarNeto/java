import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("O antecessor de " + numero +": " + (numero - 1));
        System.out.println("O sucessor de " + numero +": " + (numero + 1));
    }

}
