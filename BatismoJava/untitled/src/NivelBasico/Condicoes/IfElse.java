package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {
        //Obj: passar o ninja de nivel de acordo com o numero de missoes

        String nome = "naruto";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;

        if (numeroDeMissoes >= 10){
            System.out.println("Rank: Chinin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Genin");
        }

    }
}
