package NivelBasico;

public class Array {
    public static void main(String[] args) {
       //ao criar um array vazio vc está alocando um espaço na memória para depois inserir varios elementos
       // Diferença de array e lista: O Array tem um numero de elemntos espacificos do mesmo tipo na memória, enquanto que a lista tem tamanho flaxivel
       //Array sao tipo referencia!

        //Criando um array vazio de 3 posições do mesmo tipo
        String[]  ninja = new String[5];//new String[5] é um objeto de memória


        //indexando(incluindo) elementos no array
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";
        ninja[4] = "Kakashi";
        System.out.println(ninja[4]);


        //Redeclarar Array
        // Ao redeclarar Array ele libera a memoria para sobrescrever o array, e o array fica "vazio" se não for icluido algum elemento.
        ninja = new String[6];
        ninja[0] = "Hashirama";
        ninja[1] = "Tobirama";
        ninja[2] = "Hiruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        ninja[6] = "Naruto";

        System.out.println(ninja[2]);

        //For para fazer um loop no array
        for (int i = 0; i < ninja.length; i++) {
            System.out.println("Ninja: " + ninja[i]);

        }

        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);


        //imprimindo elementos
        System.out.println(ninja[1]);
    }
}
