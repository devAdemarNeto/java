package Encapsulamento;

public class ContaBancaria {
    //Atributos privados
    private  String titular;
    private double saldo;

    //Getter e Setter -  Metodos padrões para acessar e modificar atributos

    // Metodo para obter o titular
    public String getTitular(){
        return titular;
    }


    //metodo para modificar o titular
    public void setTitular(String titular) {
        this.titular = titular;  //this.titular -  refere-se ao atributo /  titular -  refere-se ao parametro
    }

    // Metodo para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    //metodo para modificar o titular
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor com atributos - Declara os atributos dentro do metodo, e logo depois cria o objertos com as informações

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Construtor sem atributos
    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }
}
