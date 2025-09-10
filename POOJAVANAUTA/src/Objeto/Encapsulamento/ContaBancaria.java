package Objeto.Encapsulamento;

public class ContaBancaria {
    //Atributos privados
    private String titular;
    private double saldo;

    //Getter e Setter -  Metodos padrões para acessar e modificar os atributos

    //Metodo para obter o titular
    public String getTitular(){
        return titular;
    }

    //Metodo para modificar o titular
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Contrutor: Simplifica a criação dos objetos

    //Com aributos
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Sem atributos
    public ContaBancaria() {
    }

    //Com saldo 0

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }
}
