package NivelIntermediario.PolimorfismoEAbstracao;

public class Uzumaki extends Ninja{

    // Sobreescrever a classe principal
    //Sub classe de Ninja

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque de fogo");
    }


    public  void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é minha estrategia de batalha");
    }
}
