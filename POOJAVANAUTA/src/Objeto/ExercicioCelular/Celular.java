package Objeto.ExercicioCelular;

public class Celular {
    String modelo;
    double preco;

    public double desconto(double valor){
        return preco -= valor;
    }
}
