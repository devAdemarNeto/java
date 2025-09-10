package Objeto.ExercicioCelular;

public class Main {

    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.modelo = "Samsung";
        c1.preco = 2000;

        Celular c2 = new Celular();
        c2 = c1;

        c2.desconto(500);

        System.out.println("Preço do celular 1: " + c1.preco);
        System.out.println("Preço do celular 2: " + c2.preco);



    }
}
