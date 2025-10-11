package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 16;
        naruto.aldeia = "Aldeia da folha";
        naruto.ModoSabioAtivado();
        String mensagem1 = naruto.euSouNinja();
        System.out.println(mensagem1);


        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.SharinganAtivado();
        String mensagem2 = sasuke.euSouNinja();
        System.out.println(mensagem2);

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura";
        sakura.idade = 18;
        sakura.aldeia = "Aldeia da folha";
        sakura.CuraAtivada();
        String mensagem3 = sakura.euSouNinja();
        System.out.println(mensagem3);

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata";
        hinata.idade =  16;
        hinata.aldeia = "Aldeia da folha";
        hinata.biakugam();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.idade =  16;
        boruto.aldeia = "Aldeia da folha";
        boruto.ativarJogan();
        boruto.ativarKarma();



    }

}
