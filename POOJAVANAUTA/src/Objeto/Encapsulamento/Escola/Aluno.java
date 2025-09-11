package Objeto.Encapsulamento.Escola;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        setNota(nota); // usa a validação
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
        }else {
            System.out.println("Nota inválida" + nota);
        }

    }
}
