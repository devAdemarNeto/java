import java.util.Scanner;

public class Exercicio01 {

    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.println("Digit o valor de B: ");
        double B = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double somaAB = A + B;
        if (somaAB > C){
            System.out.println("Valor da soma de A e B (" + somaAB + ")" + " é maior que o valor de C (" + C + ")" );
        }else {
            System.out.println("Valor da soma de C (" + C + ")" + " é maior que o valor da soma de A e B (" + somaAB+ ")" );
        }


    }
}
