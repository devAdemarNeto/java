package Objeto.Encapsulamento;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Ademar",500);
        System.out.println("O titular da conta é: " + conta1.getTitular() + " Com saldo de R$" + conta1.getSaldo());
        conta1.setTitular("Ademar Neto");
        conta1.setSaldo(conta1.getSaldo() + 500);

        String titularDaConta = conta1.getTitular();
        double saldoFinal= conta1.getSaldo();

        System.out.println("O titular da conta é: " + titularDaConta + " Com saldo de R$" +  saldoFinal);

        ContaBancaria conta2 = new ContaBancaria("Estela");
        System.out.println("O titular da conta é: " + conta2.getTitular() + " Com saldo de R$" + conta2.getSaldo());

    }
}
