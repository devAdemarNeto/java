package NivelIntermediario;
// Classe: Molde para um objeto
public class Ninja {
    String nome;
    String aldeia;
    int idade;





    //Metodos: Insere atributos na variavel diferentes do que elas já tem. Existem dois tipos de metodos void return
    //Criando  um metodo publico personalisado
    //Metoodo void: não precisa retornar nada, somente é declarado e depois faz a chamada do metodo



    //Metodo String: Obrigatoriamente irá retornar uma String, tem que retornar o tipo que ele está indicando
    public String euSouUmNinja(){

        return "Oi, eu sou um ninja!";
    }

    //Metodo int  com parametro
    public int anosParaSeTornarHokade(int idadeMinimaParaHokage) {

        return idadeMinimaParaHokage - idade;
    }
}
