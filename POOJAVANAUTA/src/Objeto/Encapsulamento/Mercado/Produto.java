package Objeto.Encapsulamento.Mercado;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);       // usa validação
        setQuantidade(quantidade);
    }

    public Produto(String nome) {
        this(nome, 0, 0); // reaproveita construtor acima
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido, digite um valor maior que zero");
        }

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0){
            this.quantidade = quantidade;
        }else {
            System.out.println("Quantidade inválida, digite um valor maior que zero");
        }

    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    public void removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
        } else {
            System.out.println("Quantidade inválida para remover.");
        }
    }
}
