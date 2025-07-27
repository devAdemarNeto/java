package SintaxeBasica;

public class B_Condicionais {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = true;
        String str = "Ademar";
        int[] colecaoDeInteiros = {1,2,3,4,5};
        int[] meusNumeros = new int[5];

        if (b > 99){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        System.out.println(colecaoDeInteiros[0]);
    }
}
