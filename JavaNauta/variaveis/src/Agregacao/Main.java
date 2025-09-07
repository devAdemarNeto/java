package Agregacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionarios joao = new Funcionarios("Joao");
        Funcionarios joana = new Funcionarios("Jona");
        Funcionarios mateus = new Funcionarios("Mateus");

        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();

        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(joana);
        listaDeFuncionarios.add(mateus);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFincionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
    }
}
