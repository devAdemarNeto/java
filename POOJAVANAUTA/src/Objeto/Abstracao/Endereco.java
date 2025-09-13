package Objeto.Abstracao;

//Classe abstrata
public abstract class Endereco {
    private String rua;
    private String cidade;
    private String numero;
    private String estadp;
    private String cep;

    public Endereco() {
    }

    public Endereco(String rua, String cidade, String numero, String estadp, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.estadp = estadp;
        this.cep = cep;
    }

    public Endereco(String rua, String cidade, String estadp, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estadp = estadp;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNumero() {
        return numero;
    }

    public String getEstadp() {
        return estadp;
    }

    public String getCep() {
        return cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEstadp(String estadp) {
        this.estadp = estadp;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void mostrarEndereço(){
        System.out.println("Endereço: " + rua + ", " + cidade + ", " + numero + ", "+ estadp + ", " + cep);
    }
}
