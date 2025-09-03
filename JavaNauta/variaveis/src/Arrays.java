public class Arrays {
    public static void main(String[] args) {
        //Declaracção de arrays
        int[] numeros = {10,20,30,50,1};
        String[] frutas;
        //inicializar: obrigatório inserir ou indicar a quantidade de elementos
        frutas = new String[]{"maçã","morango"};

        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 150.00;
        salarios[0] = 25.00;
        salarios[4] = 100.00;

        for (int posicao = 0; posicao < salarios.length; posicao++) {
            System.out.println("Salario "+posicao+": "+salarios[posicao]);

        }

        //for each
        for (double salario : salarios){
            System.out.println(salario);
        }

        //alterando valor
        salarios[2] = 250.00;
    }
}
