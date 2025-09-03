package NivelIntermediario.PolimorfismoEAbstracao;

public class Main {
    public static void main(String[] args) {

        //obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();


        //obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

    }
}
