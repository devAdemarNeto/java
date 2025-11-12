package Desafios.Desafio2;

import java.util.Scanner;

public class CadastroNinjas {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Array
        int numerodeninjas = 10;
        String[] ninjas = new String[numerodeninjas];

        //Contadores
        int opcao = 0;
        int ninjasCadastrados = 0;

        while (opcao != 3){

            //MENU
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");

             opcao = scanner.nextInt();
             scanner.nextLine();

            switch (opcao){
                case 1:
                    if (ninjasCadastrados < numerodeninjas){
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        //Somando mais um ninja na lista
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    }else {
                        System.out.println("A lista de ninjas está cheia, impossivel cadastrar um novo ninja");
                    }

                    break;

                case 2:

                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum nija encontrado!!");
                    }else{
                        System.out.println("===== Lista de Ninjas =====");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida tente novamente");

            }
        }


    }
}
