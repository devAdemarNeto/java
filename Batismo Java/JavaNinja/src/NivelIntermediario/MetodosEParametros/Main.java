package NivelIntermediario.MetodosEParametros;

public class Main {
    public static void main(String[] args) {
        // Criar o ninja Naruto - Naruto é um OBJETO
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;

        // Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        //Aplicando métodos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int tempoRestante=  Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Você tem " + Sasuke.idade + " então falta " + tempoRestante + " anos para se tornar Hokage");



        // Criar Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
    }
}
