package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public double depositar(double valor) {
        return saldo = saldo + (valor - (valor * 0.01));
    }
}
