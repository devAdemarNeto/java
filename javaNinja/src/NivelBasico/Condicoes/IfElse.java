package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {
        //Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
        // ie e else -  Condições
        // else if

        //Ninja Naruto
        String nome = "Naruto";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;


        //se (condição){
//            Faça isso
//        {

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if(numeroDeMissoes >= 20){
            System.out.println("Rank: Jounin");

        } else {
            System.out.println("Rank: Gennin");
        }

    }
}
