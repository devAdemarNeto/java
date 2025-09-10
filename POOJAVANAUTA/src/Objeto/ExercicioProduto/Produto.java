package Objeto.ExercicioProduto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public int comprar (int qtd){
        return quantidade += qtd;
    }

    public int vender (int qtd){
        return quantidade -= qtd;
    }

    public double calcularValorTotal(){
        return preco * quantidade;
    }
}
