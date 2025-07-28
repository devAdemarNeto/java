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

        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);


        //imprimindo elementos
        System.out.println(ninja[1]);
    }
}
