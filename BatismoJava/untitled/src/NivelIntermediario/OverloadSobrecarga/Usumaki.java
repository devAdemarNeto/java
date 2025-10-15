package NivelIntermediario.OverloadSobrecarga;

public class Usumaki extends Ninja{

    // Sobreescrever a classe principal
    //Sub classe de Ninja


    public Usumaki() {
        super();
    }

    public Usumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Usumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque de fogo, eu já completei: " + numeroDeMissoesConcluidas + " missões");
    }


    public  void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estrategia de batalha");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if(qi > 150){
            System.out.println("Seu QI é: " + qi + " e você é um genio");
        } else if (qi >= 130){
            System.out.println("Seu QI é: " + qi + " e você é promissor");
        }else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais");
        }
    }
}
