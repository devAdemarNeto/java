package Condicoes;

public class ternarios {
    public static void main(String[] args) {
        /*
        * Ternários: maneiras de reduzir o codigo
        * variavel = (condição) ? valorVerdadeiro : valorFalso
        * */


        short numeroDeMissoes = 14;
        String nivelDoNinja = (numeroDeMissoes >= 10 ) ? "Esse ninja está com mais de 10 missões" : "Esse ninja está com menos de 10 missões";
        System.out.println(nivelDoNinja);



    }
}
