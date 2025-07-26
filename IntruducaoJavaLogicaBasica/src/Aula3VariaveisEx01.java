public class Aula3VariaveisEx01 {
    public static void main(String[] args) {
        double chakra = 60.5;
        int perigo = 2;

        if (chakra > 70 && perigo == 3){
            System.out.println("Usar jutsu forte");
        }else if (chakra >= 30 && chakra <= 70){
            System.out.println("Usar jutso médio");
        }else {
            System.out.println("Fugir!!");
        }
    }
}
