package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{
    @Override
    public double depositar(double valor) {
        return saldo = saldo + valor;
    }
}
