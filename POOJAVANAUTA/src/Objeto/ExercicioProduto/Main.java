package Objeto.ExercicioProduto;

public class Main {


    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Banana";
        produto1.preco = 3.00;
        produto1.comprar(10);
        produto1.vender(2);
        double valor = produto1.calcularValorTotal();
        System.out.println(valor);
    }
}
