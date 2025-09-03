package NivelIntermediario.PolimorfismoEAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;



    // Metodo geral - Todos os ninjas vão ter mas não obrigatório
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }


    //Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " Essa é minha estrategia de batalha");
    }
}
