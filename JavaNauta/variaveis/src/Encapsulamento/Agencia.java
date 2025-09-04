package Encapsulamento;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Ademar", 500.00);
        System.out.println("O titular da conta: " + minhaConta.getTitular() + " e o saldo é: " + minhaConta.getSaldo());

        minhaConta.setTitular("Ademar Neto");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500.00);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta: " + titularConta + " e o saldo final é: " + saldoFinal);

        ContaBancaria minhaMae = new ContaBancaria("Maria");

        System.out.println("O titilar da conta: " + minhaMae.getTitular() + " e o saldo é: " + minhaMae.getSaldo());

    }
}
