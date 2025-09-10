package Objeto.Obj;

public class PlantaCasa {
    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("A casa foi constuida:");
        System.out.println("Metragem: " + metragem  );
        System.out.println("Numero de Quartos : " + numeroQuartos );
        System.out.println("Numro de banheiros: " + numeroBanheiros );
        System.out.println("Material : " + material );

    }



    public void pintar(){
        System.out.println("A casa foi pintada de " + cor);
    }


    //Metodo com parametro
    public void mudarCorParede(String novaCor){
        cor = novaCor;
        pintar();
    }

    //retorna um double
    public double somarMetrgem(){
        return metragem * numeroQuartos +numeroBanheiros;
    }
}
