package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja{

    @Override // Sobrescreve o metodo geral
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " esseé meu ataque Uchiha de fogo!!");
    }
}
