package Encapsulamento.Banco;

public class Main {
    public static void main(String[] args) {
        contaBancariaSimples contaNeto = new contaBancariaSimples(500.00, "123");
        contaNeto.depositar(50.00);
        contaNeto.sacar(150.00);


        contaNeto.getSaldo();

        System.out.println(contaNeto.getSaldo());
    }
}
