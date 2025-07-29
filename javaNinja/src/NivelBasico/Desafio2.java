package NivelBasico;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        //Entrada de Dados
        Scanner scanner = new Scanner(System.in);

        //Fazer o Array de ninjas
        int numero_max = 10;
        String[] ninjas = new String[numero_max];

        //Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;


        while (opcao != 4){

            //Cadastrar os ninjas em um array e depois mostrar opções com Switch cases
            System.out.println("-----Sistema de cadastro de Ninjas_____");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2- Listar Ninjas Cadastrados");
            System.out.println("3- Deletar Ninja");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();




            switch (opcao){
                case 1:
                    if (ninjasCadastrados < numero_max) {
                        System.out.println("Digite o nome do ninja :");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados ++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista de ninjas está cheia, impossivel cadastrar um novo ninja!!");
                    }
                    break;
                case 2:

                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja encontrado ");
                    } else {
                        System.out.println("=====Lista de Ninjas=====");
                        for (int i = 0; i < ninjas.length ; i++) {
                            System.out.println((i + 1) + " - "+ ninjas[i]);
                        }


                    }
                    break;

                case 3:
                    if (ninjasCadastrados != 0){
                        System.out.println("Escolha qual ninja você deseja excluir da lista");
                        for (int i = 0; i < ninjas.length ; i++) {
                            System.out.println((i + 1) + " - "+ ninjas[i]);
                        }

                        int del = scanner.nextInt();
                        ninjas[del] = null;
                        break;

                    } else {
                        System.out.println("Nenhum ninja encontrado ");
                    }

                case 4:

                    System.out.println("Saindo...");
                    break;


                default:
                    System.out.println("Numero inválido!!");
                    break;
            }



        }


    }
}
