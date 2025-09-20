package NivelIntermediario.OverloadSobrecargaConstrutores;

public class Main {
    public static void main(String[] args) {
        //Obj Ninja não pode ser criadao pois é uma abstração

        //obj Uzumaki
        Usumaki naruto = new Usumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Folha";
        naruto.idade = 15;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();


        //obj Uchiha
       Uchiha sasuke = new Uchiha();
       sasuke.nome = "Sasuke Uchiha";
       sasuke.aldeia = "Folha";
       sasuke.idade = 16;
       sasuke.estrategiaDeBatalhaNinja();


        //obj Uchirra 2
        // Inicializando objeto pelo construtor
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Folha", 25);

        //obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Folha", 45, 50,NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.habilidadeEspecial();



    }
}
