package NivelIntermediario.PolimorfismoEAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha {
    public String nome;
    String aldeia;
    int idade;

    // Classe Ninja é uma super classe

    //Construtores de subclasse utiliza-se a palavra this
    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Metodo geral - Todos os ninjas vão ter mas não obrigatório
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }


    //Sobreescrevendo o metodo da interface terá que utilizar a notação @override
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " Essa é minha estrategia de batalha");
    }



}
