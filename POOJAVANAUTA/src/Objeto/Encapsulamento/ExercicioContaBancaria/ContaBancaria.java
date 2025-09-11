package Objeto.Encapsulamento.ExercicioContaBancaria;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double valor){
        if (valor > 0 ){
            saldo += valor;
        }else {
            System.out.println("Deposito invalido, o valor deve ser positivo");
        }
    }
}
