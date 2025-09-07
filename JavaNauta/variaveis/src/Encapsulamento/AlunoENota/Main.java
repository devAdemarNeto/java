package Encapsulamento.AlunoENota;

public class Main {
    public static void main(String[] args) {
        Aluno neto = new Aluno("Neto");

        neto.setNota(9.5);
        System.out.println(neto.getStatus());
    }
}
