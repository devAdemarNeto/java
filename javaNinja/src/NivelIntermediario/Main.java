package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar o ninja sasuke - ele á um objeto
        Uchiha Sasuke = new Uchiha();
        //acessando os atributos
        Sasuke.nome = "Sasuki Utiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        //Aplicando metodo ao objeto por Herança
        Sasuke.SharinganAtivado();




        //Criar ninja naruto
        Uzumaki Naruto = new Uzumaki();
        //acessando os atributos
        Naruto.nome = "Naruto Usumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 16;

        //Aplicando metodo ao objeto por Herança
        Naruto.ModoSabioAtivado();



        //Criar Sakura Haruno
        Haruno Sakura = new Haruno();
        //acessando os atributos
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 15;

        //Aplicando metodo ao objeto por Herança
        Sakura.AtivarCura();




        // Criar Hinata Hyuga
        Hyuga Hinata = new Hyuga();
        //acessando os atributos
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;

        //Aplicando metodo ao objeto por Herança
        Hinata.ByakuganAtivado();


        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;

        Boruto.AtivarJougan();
        Boruto.ModoSabioAtivado();
        Boruto.AtivarKarma();


    }
}
