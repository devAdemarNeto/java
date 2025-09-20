package NivelIntermediario.ClasseAbstratasXInterfaces;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;


    //Metodo abstrato

    public abstract void nomeDoNinja();

    public void lancarKunai(){
        System.out.println("Lançar Kunai");
    }
}
