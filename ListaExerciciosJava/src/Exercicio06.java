import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double numero = scanner.nextDouble();

        double reajuste = numero + (numero * 0.05);

        System.out.println("O valor " + numero + " com reajuste de 5% é: " + reajuste);
    }
}
