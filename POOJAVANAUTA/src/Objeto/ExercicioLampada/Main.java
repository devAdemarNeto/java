package Objeto.ExercicioLampada;

public class Main {
    public static void main(String[] args) {
        Lampada l = new Lampada(); // cria uma nova lâmpada

        l.status();   // imprime: A lâmpada está desligada (porque inicia como false)
        l.ligar();    // muda o estado para true
        l.status();   // imprime: A lâmpada está ligada
        l.desligar(); // volta para false
        l.status();   // imprime: A lâmpada está desligada
    }


}
