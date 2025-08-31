package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criando objetos apartir da classe ninja

        //OBJETO 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;
        Naruto.ModoSabioAtivado();
        Naruto.habilidadeEspecial(); //polimorfismo

        //OBJETO 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Utchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Folha";
        Sasuke.sharinganAtivado();
        Sasuke.habilidadeEspecial(); //Polimorfismo



        //OBJETO 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Folha";
        Sakura.ativarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Huga";
        Hinata.idade = 16;
        Hinata.aldeia = "Folha";
        Hinata.biakugamAtivado();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;

        Boruto.AtivarJougan();
        Boruto.ModoSabioAtivado();
        Boruto.AtivarKarma();



    }
}
