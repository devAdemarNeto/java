package NivelIntermediario;
// Classe: Molde para um objeto
public class Ninja {
    String nome;
    String aldeia;
    int idade;


    //Criar um metodo publico personalisado


    //Metoodo void: não precisa retornar nada, somente é declarado e depois faz a chamada do metodo
    public void SharinganAtivado(){
        System.out.println("O sharingan Ativou!!");
    }


    //Metodo String: Obrigatoriamente irá retornar uma String, tem que retornar o tipo que ele está indicando
    public String euSouUmNinja(){
        return "Oi, eu sou um ninja!";
    }

    //Metodo com parametro
    public int anosParaSeTornarHokade(int idadeMinimaParaHokage) {
        return idadeMinimaParaHokage - idade;
    }
}
