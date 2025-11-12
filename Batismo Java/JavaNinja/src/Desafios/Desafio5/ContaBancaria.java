package Desafios.Desafio5;

public abstract class ContaBancaria  implements Conta{

    private double saldo;
    private TipoConta tipoConta;

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println(saldo);
    }

    @Override
    public abstract void depositar(double valor);
}
