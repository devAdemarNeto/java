package NivelIntermediario.Interface;

public class Main {
    public static void main(String[] args) {

        //Criando objetos apartir da classe ninja

        //OBJETO 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;
        Naruto.ModoSabioAtivado(); //Herança


        //OBJETO 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Utchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Folha";
        Sasuke.sharinganAtivado(); //Herança




        //OBJETO 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Folha";
        Sakura.ativarCura(); //Herança


        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Huga";
        Hinata.idade = 16;
        Hinata.aldeia = "Folha";
        Hinata.biakugamAtivado(); //Herança

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.idade = 10;
        boruto.aldeia = "Folha";

        boruto.ModoSabioAtivado();
        boruto.AtivarKarma();
        boruto.AtivarJogan();





    }
}
