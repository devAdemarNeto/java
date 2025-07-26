public class Aula6MetodosParametrosEx02 {
    public static int calcularDano(int forcaBase, int nivelChakra){
        return forcaBase * nivelChakra;
    }

    public static void main(String[] args) {
        int dano = calcularDano(10,7);
        System.out.println("Dano causado: " + dano);
    }
}

