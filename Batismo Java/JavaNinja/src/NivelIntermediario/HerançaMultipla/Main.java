package NivelIntermediario.HerançaMultipla;

public class Main {

    public static void main(String[] args) {

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 16;
        sasuke.SharinganAtivado();

        //Obj Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hataque";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.SharinganAtivado();
        kakashi.ninjaDeElite();
    }


}
