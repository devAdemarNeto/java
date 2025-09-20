package NivelIntermediario.ClassesAbstratas;

// classe abstrada Evita que os objetos sejam criados a partir da classe hokages
// classe abstrada não pode ser instanciadas: não pode criar um objeto a parti dela
// Vira uma super classe, e é obrigado a criar outra classe e extender a super classe



public abstract class Hokages {
    String nome;
    int idade;
    boolean vivo;
    String aldeia;
    int missoes;
    double altura;
    double saldoBancario;


    // Metodo abstrato: Eles não tem corpo,e todoas as classe que nascerem a partir da super classe, é obrigada a utilizar o metodo.

    public abstract void sabedoriaHokage();

    public Hokages() {
    }

    // Criar construtor com argumentos
    public Hokages (String nome){
        this.nome = nome; // a palavra this seta o atributo nome

    }

    public Hokages (int idade){

        this.idade = idade;
    }

    public Hokages(String nome, int idade, boolean vivo){
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
    }

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
