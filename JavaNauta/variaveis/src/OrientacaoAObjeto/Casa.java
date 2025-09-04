package OrientacaoAObjeto;

import java.sql.ResultSet;

public class Casa {
    public static void main(String[] args) {
        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variaveis) (características) da casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        //Chamada da função(metodo)
        casa.construir();
        casa.pintar();
        int resultado = casa.somarMetragem();
        System.out.println(resultado);
        casa.mudarCorParede("Branco");
        casa.alterarCaracteristicas(100, 2, 2, "Madeira");

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroBanheiros = 1;
        casaVizinho.numeroQuartos = 1;
        casaVizinho.cor = "Amarelo";

        casaVizinho.construir();
        casaVizinho.pintar();

    }
}
