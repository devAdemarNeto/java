package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        //Laços de repetição: Repetir infinitamento ou até atingir um parâmetro
        //whilw - for


        //while
        //while (condição){
        //Tudo aqui vai acontecer
        // }
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras!!" + numeroDeClones);
        }


        //For
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto fez um clone das sombras!!" + i);

        }



    }
}
