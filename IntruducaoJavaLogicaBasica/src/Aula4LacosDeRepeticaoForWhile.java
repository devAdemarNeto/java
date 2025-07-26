public class Aula4LacosDeRepeticaoForWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Treino " + i + ": Tentando usar o Rasengan...");
        }

        double chakra = 100.0;

        while (chakra > 0) {
            System.out.println("Usando clone das sombras...");
            chakra -= 20;
            System.out.println("Chakra restante: " + chakra);
        }

        int tentativas = 0;
        do {
            System.out.println("Treinando Rasengan...");
            tentativas++;
        } while (tentativas < 3);



    }
}
