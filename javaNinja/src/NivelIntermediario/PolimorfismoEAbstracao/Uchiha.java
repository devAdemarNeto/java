package NivelIntermediario.PolimorfismoEAbstracao;

public class Uchiha extends Ninja{

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque de ar");
    }

    public  void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é minha estrategia de batalha");
    }
}
