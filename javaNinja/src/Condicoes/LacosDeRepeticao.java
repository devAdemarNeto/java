package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de repetição: vão repetir constantemente até chgar na condição
        * WHILE
        * FOR
        * */

        //WHILE
        // While(condição){
        // tudo aqui vai acontecer
        // }

        int numeroDeclones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeclones <= numeroMaximoDeClones){
            numeroDeclones ++;
            System.out.println("O Nauruto fez um clone das sombras " + numeroDeclones);

        }



        //FOR
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("laço for: Nauruto fez um clone das sombras " + numeroDeclones);

        }


    }
}
