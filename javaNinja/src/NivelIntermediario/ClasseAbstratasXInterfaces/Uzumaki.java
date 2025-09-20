package NivelIntermediario.ClasseAbstratasXInterfaces;

public class Uzumaki extends Ninja implements  NinjaInterface{
    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }

    public void lancarChuriken(){
        System.out.println("Lancei a Churiken");
    }
}
