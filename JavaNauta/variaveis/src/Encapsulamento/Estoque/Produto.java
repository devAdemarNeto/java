package Encapsulamento.Estoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        if (preco >= 0){
            this.preco = preco;
        }

    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0){
            this.quantidade = quantidade;
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome =(nome != null && !nome.isEmpty()) ? nome : "Produto sem nome";
        setPreco(preco);
        setQuantidade(quantidade);
    }
}

