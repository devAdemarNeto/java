public class Aula2Variaveis {
    public static void main(String[] args) {
        String nome = "Naruto";
        int idade = 16;
        double chakra = 85.5;
        boolean ehHokage = false;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Chakra: " + chakra);
        System.out.println("É Hokage?: " + ehHokage);

        System.out.println("Treinamento...");
        chakra = chakra - 15;
        System.out.println("Chakra após treino: "+chakra);
    }
}
