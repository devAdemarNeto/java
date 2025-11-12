package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninja1 = new NinjaBasico("Ninja1", 20, "Lançar kunai");
        ninja1.mostrarInformacos();
        ninja1.executarHabilidade();

        NinjaAvancado ninja2 = new NinjaAvancado("Ninja2", 30,"Lançar shiriken", "Taijutsu");
        ninja2.mostrarInformacos();
        ninja2.executarHabilidade();


    }
}
