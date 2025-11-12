package NivelBasico;

public class Array {
    public static void main(String[] args) {
        // Array com três espaços
        // Arrays são tipos referência
        String[] ninja = new String[6];

        //Alocando o espaços do array
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Akura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hataki";

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }

        //Redeclarar Array
        ninja = new String[6]; //fica disponivel para sobescrever os dados do array anterior nã podendo acessar o array anterior


        //Array de idade
        int[] idade = new int[2];
        idade[0] = 16;


    }
}
