package Agregacao;

import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionarios> listaFuncionarios;

    public Departamento(String nome, List<Funcionarios> listaFuncionarios) {
        this.nome = nome;
        this.listaFuncionarios = listaFuncionarios;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionarios> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionarios> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void mostrarFincionarios(){
        System.out.println("Departamento de " + nome);
        listaFuncionarios.forEach(funcionario -> System.out.println(funcionario));
    }
}
