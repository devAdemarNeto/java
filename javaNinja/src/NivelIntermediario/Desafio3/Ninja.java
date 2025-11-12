package NivelIntermediario.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusDaMissao;

    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de Dificuldade: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusDaMissao);
    }
}
