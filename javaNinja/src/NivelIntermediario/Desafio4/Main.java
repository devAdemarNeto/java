package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {
        Ninja ninja1 = new NinjaBasico("Naruto", 16, "Clones das Sombras");
        Ninja ninja2 = new NinjaAvancado("Sasuke", 17, "Chidori", "Sharingan");

        ninja1.mostrarInformacoes();
        ninja1.executarHabilidade();

        System.out.println();

        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();
    }
}
