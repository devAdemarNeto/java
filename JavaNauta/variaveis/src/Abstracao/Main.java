package Abstracao;

public class Main {
    public static void main(String[] args) {
        Funcionario ademar = new Funcionario("Tv. N5", "Belem", "397", "Para", "66813750","Ademar", "12345678925", "TI" );

        Cliente neto = new Cliente("Tv. N4", "Belém", "Pará", "66813000","Neto", "12345678985");


        System.out.println(ademar);
        ademar.mostrarEndereco();
        System.out.println(neto);
        neto.mostrarEndereco();
    }





}
