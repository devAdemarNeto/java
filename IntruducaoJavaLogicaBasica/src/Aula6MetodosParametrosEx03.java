public class Aula6MetodosParametrosEx03 {
    public static void treinarJutsu(String nomeJutsu, int vezes){
        for (int i = 1; i < vezes; i++) {
            System.out.println("Ninja treinou " + i+ ": "  + nomeJutsu );
        }
    }

    public static void main(String[] args) {
        treinarJutsu("Rasegan", 5);
    }
}
