package Objeto.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        int sabaoEmPo = 1;
        int mamao = 2;
        double sabonete = 2.50;
        double arroz = 5.90;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;


        int total1 = Calculadora.somar(sabaoEmPo,mamao);
        double total2 = Calculadora.somar(sabonete,arroz);
        Integer total3 = Calculadora.somar(batata, cenoura, melancia);

        Carro fusca = new Carro();
        fusca.mover();

    }
}
