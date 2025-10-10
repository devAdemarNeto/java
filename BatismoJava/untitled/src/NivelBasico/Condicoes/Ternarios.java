package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        //variavel = (condição) ?(if) valorSeVerdadeiro :(else) valorSeFalso;

        short numeroDeMissoes = 14;
        String nivelDoNinja = (numeroDeMissoes >= 10 ) ? "Ninja com mais de 10 missões" : "Ninja com menos de 10 missões";
        System.out.println(nivelDoNinja);

    }
}
