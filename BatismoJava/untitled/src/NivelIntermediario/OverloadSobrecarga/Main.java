package NivelIntermediario.OverloadSobrecarga;

public class Main {
    public static void main(String[] args) {
        //Obj Ninja não pode ser criadao pois é uma abstração

        //obj Uzumaki
        Usumaki naruto = new Usumaki("Naruto Uzumaki", "Folha", 15, 30, NivelNinja.GENIN);

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        System.out.println(naruto);


        //obj Uchiha
       Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha",18,30,NivelNinja.GENIN);
       sasuke.estrategiaDeBatalhaNinja();


        //obj Uchirra 2
        // Inicializando objeto pelo construtor
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Folha", 25);

        //obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Folha", 45, 50,NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.habilidadeEspecial();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(180);


    }
}
