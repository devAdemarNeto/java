package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo, TipoConta.CORRENTE);
    }

    @Override
    public void depositar(double valor) {
        if(valor <= 0){
            System.out.println("Deposito invalido. O valor deve ser maior que zero.");
            return;
        }
        setSaldo(getSaldo() + valor);
        System.out.println("Deposito de " + valor + " realizado com sucesso! Novo saldo: " + getSaldo());
    }
}
