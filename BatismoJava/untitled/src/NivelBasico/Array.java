package NivelBasico;

public class Array {
    public static void main(String[] args) {
        String[] ninjas = new String[6];
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";
        ninjas[3] = "Hinata";
        ninjas[4] = "Kakashi";

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);

        }

        //Redeclarar Array

        //ninjas = new String[6];//Ao redeclarar ele sobescreve os elementos e a referencia da memoria altera

       // System.out.println(ninjas[2]);
    }
}
