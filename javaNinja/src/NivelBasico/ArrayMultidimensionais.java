package NivelBasico;

public class ArrayMultidimensionais {
    public static void main(String[] args) {
        String[][] ninjasEAldeis = new String[3][3];
        ninjasEAldeis[0][0] = "Konoha";
        ninjasEAldeis[0][1] = "Naruto";
        ninjasEAldeis[0][2] = "Sasuke";

        ninjasEAldeis[1][0] = "Nevoa";
        ninjasEAldeis[1][1] = "Zabuza";
        ninjasEAldeis[1][2] = "Haku";

        ninjasEAldeis[2][0] = "Deserto";
        ninjasEAldeis[2][1] = "Gara";
        ninjasEAldeis[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeis.length; i++) {
            System.out.println(ninjasEAldeis[i][0]);

        }

    }
}
