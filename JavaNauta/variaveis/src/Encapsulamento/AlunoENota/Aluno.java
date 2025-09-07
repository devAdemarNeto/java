package Encapsulamento.AlunoENota;

public class Aluno {
     private String nome;
    private double nota;



    public String getNome() {
        return nome;
    }



    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
        }else {
            System.out.println("Nota inválida");
        }
    }

    public double getNota() {
        return nota;
    }



    public String getStatus(){
        if(nota >= 7){
            return "Aprovado";
        } else if (nota >= 5) {
            return "Recuperação";
        }else{
            return "Reprovado";
        }
    }

    public Aluno(String nome, double nota) {
        this.nome = nome;
        setNota(nota);
    }

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }
}
