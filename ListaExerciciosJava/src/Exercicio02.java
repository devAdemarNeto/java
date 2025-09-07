import java.util.Scanner;

public class Exercicio02 {
    //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = scanner.nextDouble();


        if (numero % 2 == 0){
            System.out.println("O numero " + numero + " que você escolheu é: ");
            System.out.println("Par");
            if (numero > 0){
                System.out.println("positivo");
            }else {
                System.out.println("Negativo");
            }

        }else {
            System.out.println("O numero " + numero + " que você escolheu é: ");
            System.out.println("Impar");
            if (numero > 0){
                System.out.println("positivo");
            }else {
                System.out.println("Negativo");
            }
        }
    }
}
