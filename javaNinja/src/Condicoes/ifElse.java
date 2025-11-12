package Condicoes;

public class ifElse {
    public static void main(String[] args) {
        String noma = "Naruto Uzumaki";
        int idade = 16 ;
        boolean hokage = false;
        short numeroDeMissoes = 14;
        String rank;

        if (numeroDeMissoes >= 10 && idade > 15) {

            System.out.println("Rank: Chounin");
        } else if (numeroDeMissoes >=20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
