package NivelIntermediario;

public class Uchiha extends Ninja{

    public void sharinganAtivado(){

        System.out.println("Meu nome é " + nome + ". O Sharingan Ativou, eu sou Uchiha" );
    }

   //polimorfismo
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " esse é meu ataque Uchiha, ataque de fogo");
    }
}
