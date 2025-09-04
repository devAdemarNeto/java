package Encapsulamento.Banco;

public class contaBancariaSimples {
    private String numeroConta;
    private double saldo;



    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valor){
        if (valor > 0){
           this.saldo += valor;
        }

    }

    public void sacar (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
    }




    public contaBancariaSimples(double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public contaBancariaSimples() {
    }
}
