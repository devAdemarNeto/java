package Objeto.ExercicioLampada;

public class Lampada {
    // atributo que representa o estado atual da lâmpada
    boolean ligada; // começa como false por padrão

    // método que liga a lâmpada
    void ligar() {
        ligada = true;
    }

    // método que desliga a lâmpada
    void desligar() {
        ligada = false;
    }

    // método que mostra o status atual
    void status() {
        if (ligada) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
}
