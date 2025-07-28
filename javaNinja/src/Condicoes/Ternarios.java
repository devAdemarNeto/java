package Condicoes;

public class Ternarios {

    public static void main(String[] args) {
        //Ternarios: maneiras de reduzir o código
        //variavel = (condição) ? verdadeira : falso;

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja temmenos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}
