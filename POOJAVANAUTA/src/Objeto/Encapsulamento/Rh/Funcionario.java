package Objeto.Encapsulamento.Rh;

public class Funcionario {
    private String nome;
    private double salario;
    private double bonus;

    public Funcionario(String nome, double salario, double bonus) {
        this.nome = nome;
        setSalario(salario);
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario >= 0 ){
            this.salario = salario;
        }else {
            System.out.println("Valor inválido, Digite um valor maior ou igual a zero");
        }

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            System.out.println("Bônus inválido. Digite um valor maior ou igual a zero.");
        }
    }


    public double calcularSalarioFinal(){
        return salario+bonus;
    }

    public void exibirInfoFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salario);
        System.out.println("Bônus: " + bonus);
        System.out.println("Salário Final: " + calcularSalarioFinal());
    }

}
