package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //padrão de inicialização
        //byte, short, int, long, float e double = 0
        //char, '\u0000'= ''
        //boolean = false
        //String null
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kuririn";
        nomes[2] = "Picolo";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }
}
