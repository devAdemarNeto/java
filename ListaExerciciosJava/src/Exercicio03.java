import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        //caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        //imprimir seu valor na tela.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.println("Digite o  valor de B: ");
        int B = scanner.nextInt();

        if (A == B){
            int C = A+B;
            System.out.println("A soma entre A e B é " + C);
        }else {
            int C = A*B;
            System.out.println("A multiplicação entre A e B " + C);
        }
    }
}
