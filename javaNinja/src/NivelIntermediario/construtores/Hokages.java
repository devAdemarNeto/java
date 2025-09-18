package NivelIntermediario.construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivo;
    String aldeia;
    int missoes;
    double altura;
    double saldoBancario;

    //No args constuctor: construtor sem argumentos
    public Hokages() {
    }

    // Criar construtor com argumentos

    public Hokages (String nome){
        this.nome = nome; // a palavra this seta o atributo nome, referencia o atributo

    }

    public Hokages (int idade){

        this.idade = idade;
    }

    public Hokages(String nome, int idade, boolean vivo){
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
    }

    //all args constructor: construtor com todos os argumentos
    public Hokages(int idade, String nome, boolean vivo, String aldeia, int missoes, double altura, double saldoBancario) {
        this.idade = idade;
        this.nome = nome;
        this.vivo = vivo;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.altura = altura;
        this.saldoBancario = saldoBancario;
    }

}
