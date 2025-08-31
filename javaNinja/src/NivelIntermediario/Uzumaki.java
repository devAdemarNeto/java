package NivelIntermediario;

public class Uzumaki extends Ninja{

    public void ModoSabioAtivado() {
        System.out.println("Meu nome é "+ nome +". Modo sabio ativado!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " esse é meu ataque Uzumaki, um ataque de ar");
    }
}
