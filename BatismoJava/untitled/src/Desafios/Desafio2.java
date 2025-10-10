package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroMax = 10;
        String[] ninja = new String[numeroMax];


        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao !=3){
            System.out.println("-----SISTEMA DE CADASTRO DE NINJAS-----");
            System.out.println("1 - Cadastrar Ninjas");
            System.out.println("2- Listar Ninjas");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (ninjasCadastrados < numeroMax){
                        System.out.println("Digite o nome do ninja");
                        String nomeNinja = scanner.nextLine();
                        ninja[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!!!");

                    }else {
                        System.out.println("Lista de ninjas está cheia");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("nenhum ninja enccontrado");
                    }else {
                        System.out.println("===== Lista de ninjas =====");
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.println(ninja[i]);
                            
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente!");

            }
        }
    }
}
