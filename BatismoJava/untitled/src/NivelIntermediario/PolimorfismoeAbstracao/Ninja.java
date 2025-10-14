package NivelIntermediario.PolimorfismoeAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    int idade;
    String aldeia;

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }



    @Override
    public  void estrategiaBatalha(){
        System.out.println("Essa é miha estratégia");
    }




}
