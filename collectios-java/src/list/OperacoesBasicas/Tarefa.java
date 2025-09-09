package list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String dscricao) {
        this.descricao = dscricao;
    }

    public String getDscricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao ;
    }

    public String getDescricao() {
        return descricao;
    }
}
