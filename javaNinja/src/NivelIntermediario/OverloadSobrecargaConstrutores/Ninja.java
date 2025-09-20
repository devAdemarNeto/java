package NivelIntermediario.OverloadSobrecargaConstrutores;

public abstract class  Ninja implements EstrategiaDeBatalha{
    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Gennin, Chunin, Jounin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;



    // Classe Ninja é uma super classe
    //Construtores de subclasse utiliza-se a palavra this
    public Ninja() {
    }

    //Primeiro construtor
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do construtor chamando os novos atributos
    //Sobrecarga de construtores voce não precisa redeclarar o construtor, somente os novos atributos


    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);//
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
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
