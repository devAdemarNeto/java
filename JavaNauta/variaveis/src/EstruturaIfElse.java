public class EstruturaIfElse {
    public static void main(String[] args) {
        int idade =30;

        if (idade >= 18){
            System.out.println("maior de idade");
        } else {
            System.out.println("Menor de idade");
        }


        //ternário
        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(mensagem);


        boolean estaChovendo = true;
        if (estaChovendo){
            System.out.println("Ficar em casa");
        } else {
            System.out.println("não sair de casa");
        }

    }

}
