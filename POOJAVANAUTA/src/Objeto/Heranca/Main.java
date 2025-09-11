package Objeto.Heranca;

public class Main {
    public static void main(String[] args) {
        Cachorro caramelo  = new Cachorro();
        caramelo.latir();
        caramelo.comer("ração");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha gertrudes = new Galinha();
        gertrudes.ciscar();
        gertrudes.comer("Minho");
        gertrudes.beberAgua();
        gertrudes.dormir();
    }
}
