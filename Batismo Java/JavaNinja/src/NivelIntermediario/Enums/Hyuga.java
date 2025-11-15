package NivelIntermediario.Enums;

public class Hyuga extends Ninja {

    //Sharingan ativado, metodo publico
    public void ByakuganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Byakugan Ativou, eu sou um Hyuga!");
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu é " + nome );
    }
}
