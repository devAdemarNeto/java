package OrientacaoAObjeto;

public class PlantaCasa implements Construcao{
    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;


    @Override
    public void construir(){
        System.out.println("A casa foi construida, as características são: ");
        System.out.println("Metragem: " + metragem);
        System.out.println("Nº Quartos: " + numeroQuartos);
        System.out.println("Nº Banhairos: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }

    public void pintar(){
        System.out.println("A casa foi pintada de: " + cor);
    }

    public void mudarCorParede(String novaCor){
        cor = novaCor;
        pintar();

    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiros;
        material = mat;
    }

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }




    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa coma cor: " + cor);

    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }
}
