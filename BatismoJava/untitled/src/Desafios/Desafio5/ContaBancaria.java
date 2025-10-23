package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    @Override
    public double consultarSaldo() {
        return  saldo;
    }

    @Override
    public abstract double depositar(double valor);

}
