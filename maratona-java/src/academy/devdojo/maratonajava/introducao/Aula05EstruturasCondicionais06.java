package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    // Utilizando switch Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
    // Considerando 1 como domingo
    public static void main(String[] args) {
        byte dia = 3;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }

    }



}
