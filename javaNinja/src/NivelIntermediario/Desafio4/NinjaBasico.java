package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idadade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }



    @Override
    public void mostrarInformacoes(){
        System.out.println("Ninja Básico");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidad: " + habilidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println(nome + " stá execuntando a habilidade: " + habilidade);

    }
}
