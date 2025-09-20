package NivelIntermediario.PolimorfismoEAbstracao;

public class Main {
    public static void main(String[] args) {
        //Obj Ninja não pode ser criadao pois é uma abstração

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


        //obj Uchirra 2
        // Inicializando objeto pelo construtor
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Folha", 25);

    }
}
