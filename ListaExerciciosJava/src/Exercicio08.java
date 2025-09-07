import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numeros = new ArrayList<>();
        System.out.println("Quantos valores você deseja inserir:");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade ; i++) {
            System.out.println("Digite o numero " + (i+1) + ":" );
            String numero = scanner.nextLine();
            numeros.add(numero);

        }
        Collections.sort(numeros);
        Collections.sort(numeros,Collections.reverseOrder());
        System.out.println("Numeros na ordem decrescente: " + numeros);



    }
}
