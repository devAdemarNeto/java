package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo, TipoConta.POUPANCA);
    }

    @Override
    public void depositar(double valor) {
        if(valor <= 0){
            System.out.println("Deposito invalido. O valor deve ser maior que zero.");
            return;
        }

        if (valor < 0.10){
            System.out.println("Deposito inválido. O valor deve ser maior que R$0,10");
            return;
        }
        double taxa = valor * 0.01;
        setSaldo(getSaldo() + (valor - taxa));
        System.out.println("Taxa de " + taxa + " aplicada sobre o depósito de " + valor);
        System.out.println("Deposito de " + valor + " realizado com sucesso! Novo saldo: " + getSaldo());

    }
}
