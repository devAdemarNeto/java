package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a consumir alcool");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a consumir alcool");
        }
        System.out.println("Fora de if");
    }
}
