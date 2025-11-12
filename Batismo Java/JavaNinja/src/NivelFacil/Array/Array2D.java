package NivelFacil.Array;

public class Array2D {
    public static void main(String[] args) {
        String[][] aldeiasENinjas = new String[3][3];
        aldeiasENinjas[0][0] = "Konoha";
        aldeiasENinjas[0][1] = "Naruto";
        aldeiasENinjas[0][2] ="Sasuke";

        aldeiasENinjas[1][0] = "Nevoa";
        aldeiasENinjas[1][1] = "Zabuza";
        aldeiasENinjas[1][2] = "Haku";

        aldeiasENinjas[2][0] = "Deserto";
        aldeiasENinjas[2][1] =  "Gaara";
        aldeiasENinjas[2][2] =  "Temari";

        for (int i = 0; i < aldeiasENinjas.length; i++) {
            System.out.println(aldeiasENinjas[0][1]);
        }
    }
}
