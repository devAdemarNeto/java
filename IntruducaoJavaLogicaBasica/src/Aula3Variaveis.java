public class Aula3Variaveis {
    public static void main(String[] args) {
        double chakra = 40.0;
        String inimigo = "Pain";

        if (chakra > 60) {
            System.out.println("Naruto: Usar Modo Sábio contra " + inimigo);
        }else if (chakra > 30) {
            System.out.println("Naruto: Usar Clones das Sombras");
        }else {
            System.out.println("Naruto: Recuar e restaurar chakra!");
        }
    }
}
