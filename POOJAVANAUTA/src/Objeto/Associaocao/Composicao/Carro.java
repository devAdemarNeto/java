package Objeto.Associaocao.Composicao;

public class Carro {
    //atributo do tipo motor
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    //inicializando o objeto motor dentro da classe carro
    public Carro(int cilindrades){
        this.motor = new Motor(cilindrades);
    }

    public void mostrarCilindradas(){
        System.out.println("Caro com um motor de " + motor.getCilidradas() + " cilindradas");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
