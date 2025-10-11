package Desafios.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade" + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando a a habilidade: " + habilidade);
    }
}
