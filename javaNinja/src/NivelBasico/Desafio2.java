package NivelBasico;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner caixaDeTexto = new Scanner(System.in);

        //Fazer um array
        int Numero_max = 10;
        String[] ninjas = new String[Numero_max];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 4){
            // Cadastrar ninjas em um array e dpois mostrar opções com switch case
            System.out.println("\n-----Sistema de Cadastro de Ninjas------");
            System.out.println("1 - Cadastrar Ninjas ");
            System.out.println("2- Listar Ninjas cadastrados");
            System.out.println("3- Deletar Ninja");
            System.out.println("4- Sair");
            System.out.println("Escolhauma opção");
            opcao = caixaDeTexto.nextInt();
            caixaDeTexto.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < Numero_max){
                        System.out.println("Digite o nome do ninja para cadastro");
                        String nomeNinja = caixaDeTexto.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados ++;
                        System.out.println("Ninja cadastrado com sucesso");

                    } else {
                        System.out.println("Lista de ninjas está cheia!!!");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrados");
                    } else {
                        System.out.println("Lista de ninjas");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }

                    }
                    break;

                case 3:
                    //fazer o caso 3


                    break;

                case 4 :
                    System.out.println("Saindo ...");
                    break;

                default:
                    System.out.println("Numero inválido!!!");
                    break;

            }
        }
    }
}
