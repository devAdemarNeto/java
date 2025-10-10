package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        //Criar um ninja
        int idade = 16; // valor maximo 2 bilhões
        double altura = 1.64;
        char inicial = 'N';
        boolean vivoOuMorto = false;
        Long saldoBancario = 999999L; // usar em numeros acima de 2 bilhões

        System.out.println(idade);
        System.out.println(altura);
        System.out.println(inicial);
        System.out.println(vivoOuMorto);
        System.out.println(saldoBancario);
    }
}
