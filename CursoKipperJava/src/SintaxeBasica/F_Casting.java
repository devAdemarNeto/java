package SintaxeBasica;

public class F_Casting {
    //Casting => transforma o valor de variavel, como se declasse uma variavel nova
    //ex:

    //casting explicito
    double resultado = 0.0;
    int resultadoInt = (int) resultado;

    //casting implicito
    int meuInt = 10;
    double meuDouble = meuInt;

    //casting explicito
    String meuString = "10";
    int meuInt2 = Integer.parseInt(meuString);
}
