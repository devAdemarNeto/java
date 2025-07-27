package TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto Usumaki";
        int idade = 16;
        String missao = "Escolta";
        String statusDaMissao =  "Em andamento";
        char rank = 'A';


        //Verificar nivel da missão e idade

        if (idade < 15) {
            if (rank == 'C' || rank == 'D'){
                statusDaMissao = "Missão concluida";
            }else {
                statusDaMissao = "Não concluida, idade insuficiente";
            }
        } else {
            statusDaMissao = "Concluida";

        }

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Nome da missão: " + missao);
        System.out.println("Status da missão: " + statusDaMissao);
        System.out.println("Rank da missão: " + rank);

        System.out.println("----------------------------------");







        String nomeNinja2 = "Sasuke";
        int idade2 = 16;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 =  "Em andamento";
        char rank2 = 'S';


        //Verificar nivel da missão e idade

        if (idade2 < 15) {
            if (rank2 == 'C' || rank2 == 'D'){
                statusDaMissao2 = "Missão concluida";
            }else {
                statusDaMissao2 = "Não concluida, idade insuficiente";
            }
        } else {
            statusDaMissao2 = "Concluida";

        }

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Nome da missão: " + missao2);
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("Rank da missão: " + rank2);


        System.out.println("----------------------------------");



        String nomeNinja3 = "Sarada";
        int idade3 = 16;
        String missao3 = "curar feridos";
        String statusDaMissao3 =  "Em andamento";
        char rank3 = 'C';


        //Verificar nivel da missão e idade

        if (idade3 < 15) {
            if (rank3 == 'C' || rank3 == 'D'){
                statusDaMissao3 = "Missão concluida";
            }else {
                statusDaMissao3 = "Não concluida, idade insuficiente";
            }
        } else {
            statusDaMissao3 = "Concluida";

        }

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Nome da missão: " + missao3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("Rank da missão: " + rank3);

    }
}
