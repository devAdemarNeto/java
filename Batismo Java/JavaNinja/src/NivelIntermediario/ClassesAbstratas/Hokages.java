package NivelIntermediario.ClassesAbstratas;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNão;

    public abstract void sabedoriaHokage();

    public Hokages() {
    }

    public Hokages(String nome, int idade, boolean vivoOuNão) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNão = vivoOuNão;
    }
}
