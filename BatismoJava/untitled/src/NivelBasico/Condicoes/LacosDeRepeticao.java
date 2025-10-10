package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        //while (enquanto condição verdadeira){ o código roda
        // incrementar condição}
        int numeroClones = 0;
        int numeroMaxClones = 40;

//        while (numeroClones <= numeroMaxClones){
//            numeroClones++;
//            System.out.println(numeroClones + "º clone");
//
//        }


        //for()
        for (int i = 1; i < numeroMaxClones; i++) {
            System.out.println(i + "º clone");
        }
    }
}
