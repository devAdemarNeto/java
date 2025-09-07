import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.518,00).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario: R$");
        double salarioUsuario = scanner.nextDouble();
        double salarioMinimo = 1518.00;

        double quantosSalarios = salarioUsuario / salarioMinimo;

        if (quantosSalarios == 1 ){
            System.out.println("Você recebe " + quantosSalarios + " Salario minimo" );
        }else {
            System.out.println("Você recebe " + quantosSalarios + " Salarios minimos" );
        }


    }
}
