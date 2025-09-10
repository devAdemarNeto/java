package Objeto.Interface;

public class Carro implements Veiculo {
    @Override
    public void acelerar(){
        System.out.println("Carro acelerendo");
    }

    @Override
    public void frear(){
        System.out.println("Carro freando");
    }
}
