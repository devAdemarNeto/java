package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    // while, do while, for
    public static void main(String[] args) {
        int count = 0;
        while (count<10){
            System.out.println(count);
            count++;
        }
        count = 0;
        do {
            System.out.println("dentro do while");
        }while (count < 10);


        for (int i=0;1 < 10; i++){
            System.out.println(i);
        }
    }
}
