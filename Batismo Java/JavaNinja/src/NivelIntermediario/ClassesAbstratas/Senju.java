package NivelIntermediario.ClassesAbstratas;

public class Senju extends Hokages{

    public Senju() {
    }

    public Senju(String nome, int idade, boolean vivoOuNão) {
        super(nome, idade, vivoOuNão);
    }

    @Override
    public void sabedoriaHokage() {
        System.out.println("Voce ganhou sabedoris");
    }
}
