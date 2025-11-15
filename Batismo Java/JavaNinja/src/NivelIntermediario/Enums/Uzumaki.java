package NivelIntermediario.Enums;

public class Uzumaki extends Ninja {

    public void ModoSabioAtivado() {

        System.out.println("Meu é " + nome + ". E eu ativei o modo Sabio"  );

    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu é " + nome );
    }
}
