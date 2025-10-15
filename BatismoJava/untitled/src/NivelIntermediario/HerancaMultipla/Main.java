package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Folha";
        sasuke.idade = 16;
        sasuke.sharinganAtivado();


        //obj Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kkashi Hataki";
        kakashi.aldeia = "Folha";
        kakashi.idade = 40;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaElite();

        //obj Usumaki
        Usumaki naruto = new Usumaki();
        naruto.nome = "Naruto Usumaki";
        naruto.aldeia = "Folha";
        naruto.idade = 15;


    }
}
