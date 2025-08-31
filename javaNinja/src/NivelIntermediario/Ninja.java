package NivelIntermediario;
// Classe: Molde para um objeto
public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Metodo geral! Todos os ninjas vao ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " esse é meu ataque especial");
    }





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
