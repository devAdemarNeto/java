package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        int sabaoPa = 1;
        int mamao = 2;
        double sabonete = 2.50;
        double arroz = 5.90;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;

        int total = Calculadora.somar(sabaoPa, mamao);
        double totalDouble = Calculadora.somar(sabonete,arroz);
        Integer totalInterger = Calculadora.somar(cenoura, melancia);

        Carro fusca = new Carro();
        fusca.mover();
    }
}
