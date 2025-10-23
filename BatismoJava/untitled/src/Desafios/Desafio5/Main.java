package Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaNeto = new ContaCorrente();
        contaNeto.depositar(100);
        contaNeto.depositar(50);
        Double saldoconta = contaNeto.consultarSaldo();
        System.out.println("O saldo da conta é: " + saldoconta);


        ContaPoupanca contaAdemar = new ContaPoupanca();
        contaAdemar.depositar(100);
        contaAdemar.depositar(50);
        Double saldo = contaAdemar.consultarSaldo();
        System.out.println("O saldo da conta é: " + saldo);
    }
}
