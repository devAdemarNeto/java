package Objeto.Encapsulamento.ExercicioPessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ademar", 38);
        String nomePessoa1 = pessoa1.getNome();
        int idadePessoa1 = pessoa1.getIdade();

        System.out.println("Meu nome é " + nomePessoa1 + " e tenho " + pessoa1.getIdade() + " anos");
    }
}
