package Objeto.Abstracao;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Tv. N5","Belem","397","Para","66813750","Ademar","12345678912","Desenvolvedor");
        Cliente cliente1 = new Cliente("Tv. n5","Belem","Para","12345678995","Thaianae","12345678965");

        System.out.println(funcionario1);
        funcionario1.mostrarEndereço();

        System.out.println(cliente1);
        cliente1.mostrarEndereço();
    }
}
