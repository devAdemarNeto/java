package NivelIntermediario.OverloadSobrecarga;

public class Uchiha extends Ninja{

    //usa-se a anotação sobrescrever o metodo da classe ninja
    //Sub classe de Ninja


    //Construtores de subclasse utiliza-se a palavra super
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    //Sobrecarga nas sub classes
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque de ar");
    }

    public  void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é minha estrategia de batalha");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " Essa é minha inteligencia de batalha");
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
