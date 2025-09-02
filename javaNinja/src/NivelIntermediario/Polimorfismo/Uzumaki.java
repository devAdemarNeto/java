package NivelIntermediario.Polimorfismo;

public class Uzumaki extends Ninja {

    @Override // sobrescreve o metodo geral
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " esse é meu ataque uzumaki de ar!!");
    }
}
