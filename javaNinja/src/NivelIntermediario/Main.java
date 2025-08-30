package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criando objetos apartir da classe ninja

        //OBJETO 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;
        Naruto.modoSabioAtivado();

        //OBJETO 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Utchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Folha";
        Sasuke.sharinganAtivado();



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
        Boruto.nome = "Boruto Hyuga Usumaki";
        








        //Chamando metodo String  euSouUmNinja(), com uma variavel
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        //Chamando metodo com paranmetro
        int quantoTempoFalta = Sasuke.anosParaSeTornarHokade(70);
        System.out.println("Voce tem" + Sasuke.idade + " Então falta no minimo: " + quantoTempoFalta + " para você se tornar hokage");


    }
}
