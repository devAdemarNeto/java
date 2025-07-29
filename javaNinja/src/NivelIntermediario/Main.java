package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criando objetos apartir da classe ninja

        //Criar Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;

        //Criar Sasuke
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Utchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Folha";

        //aplicando metodo ao objeto
        Sasuke.SharinganAtivado();

        //Chamando metodo String eu euSouUmNinja()
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        //Chamando metodo com paranmetro
        int quantoTempoFalta = Sasuke.anosParaSeTornarHokade(70);
        System.out.println("Voce tem" + Sasuke.idade + " Então falta no minimo: " + quantoTempoFalta + " para você se tornar hokage");


        //Criar Sakura
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Folha";

    }
}
