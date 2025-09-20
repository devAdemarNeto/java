package NivelIntermediario.OverloadSobrecargaConstrutores;

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
}
