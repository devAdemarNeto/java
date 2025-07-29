package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        //Dados não primitivos:  String, Array, Class, enum
        //Objetivo: criar um ninja e atribuir metodos a ele

        String nome = "Naruto Usumaki";
        String nomeUpperCase = nome.toUpperCase(); //Vai colocar tudo em caps lock
        System.out.println("Texto em CAPS LOCK" + nomeUpperCase);
        System.out.println("Texto normal" + nome);


        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // colocar tudo em minuculo
        System.out.println(aldeiaLowerCase);


    }
}
