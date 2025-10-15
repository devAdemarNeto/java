package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{
    public void boasVindas(){
        System.out.println(nome + " eu sou um Hatake");
    }

    //Esse méto vem direto da interface
    public void sharinganAtivado(){
        System.out.println(nome + " o Sharingan ativou");
    }

    public void ninjaElite(){
        System.out.println(nome+ " Eu sou um ninja de elite da Anbu!");
    }
}
