package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros2[i]);

        }

        //foreach
        for (int num : numeros3){
            System.out.println(num);
        }
    }
}
