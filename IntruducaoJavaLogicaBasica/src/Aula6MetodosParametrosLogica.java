public class Aula6MetodosParametrosLogica {
    public static void usarJutsu(String nome, int chakra){
        if (chakra >= 50){
            System.out.println("Usou" + nome + "! Chakra restante: " + (chakra - 50));
        } else {
            System.out.println("Chakra insuficiente para usar" + nome);
        }
    }

    public static void main(String[] args) {
        usarJutsu("Nsruto",100 );
    }
}
