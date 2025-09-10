package Objeto.Obj;

public class Casa {
    public static void main(String[] args) {
        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variaveis) características da casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "tijolo";
        casa.cor = "Cinza";

        //chamada da função
        casa.construir();
        casa.pintar();

        double resultado = casa.somarMetrgem();
        System.out.println(resultado);

        casa.mudarCorParede("Branco");
    }
}
