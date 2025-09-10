package Objeto.ExercicioCarro;

public class Carro {
    String modelo;
    int ano;
    int velocidade;

    public int acelarar(int valor){
        return  velocidade += valor;
    }

    public int frear(int valor){
        velocidade -=  valor;
        if (valor < 0){
          return 0;

        } else {
            return velocidade;
        }

    }
}
