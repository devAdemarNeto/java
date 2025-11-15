package NivelIntermediario.Enums;

public class Uchiha extends Ninja {

    //Sharingan ativado, metodo publico
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Sharingan Ativou, eu sou um Uchiha!");
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu é " + nome );
    }
}
