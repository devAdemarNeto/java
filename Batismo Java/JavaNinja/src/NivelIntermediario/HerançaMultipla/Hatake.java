package NivelIntermediario.HerançaMultipla;

public class Hatake extends Ninja implements SharinganInterface , AnbuInterface{

    public void boasVindas(){
        System.out.println(nome +": Eu sou um Hatake");

    }

    @Override
    public void SharinganAtivado() {
        System.out.println(nome + "Sharingan Ativou!!!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + " sou um ninja de elite da Anbu");
    }
}
