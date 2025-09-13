package Objeto.Abstracao;

public class Funcionario extends Endereco implements Pessoa{
    private String nome;
    private String documento;
    private String cargo;

    public Funcionario(String rua, String cidade, String numero, String estadp, String cep, String nome, String documento, String cargo) {
        super(rua, cidade, numero, estadp, cep);//chamando os metodos da classe pai no casso aqui é endereço
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostrarEndereço() {
        System.out.println("Endereçodo funcionario: " + getRua() + ", " + getCidade() + ", " + getNumero() + ", "+ getEstadp() + ", " + getCep());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
