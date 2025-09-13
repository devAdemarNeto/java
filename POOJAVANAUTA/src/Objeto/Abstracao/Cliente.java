package Objeto.Abstracao;

public class Cliente extends Endereco implements Pessoa {

    private String nome;
    private String documento;

    public Cliente(String rua, String cidade, String estadp, String cep, String nome, String documento) {
        super(rua, cidade, estadp, cep);
        this.nome = nome;
        this.documento = documento;
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

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }

    @Override
    public void mostrarEndereço() {
        System.out.println("Endereço do cliente: " + getRua() + ", " + getCidade() + ", " + getEstadp() + ", " + getCep());
    }


}
