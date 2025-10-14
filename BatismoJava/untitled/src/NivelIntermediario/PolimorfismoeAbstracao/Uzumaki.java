package NivelIntermediario.PolimorfismoeAbstracao;


public class Uzumaki extends Ninja {

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial de ar!!");
    }

    public  void estrategiaBatalha(){
        System.out.println("Essa é miha estratégia");
    }

}
