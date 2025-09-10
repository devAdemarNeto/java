package Objeto.ExercicioCarro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Onix";
        carro1.ano = 2005;
        carro1.velocidade = 100;
        carro1.acelarar(20);
        carro1.frear(70);


        System.out.println("Valocidade final: " + carro1.velocidade);
    }

}
