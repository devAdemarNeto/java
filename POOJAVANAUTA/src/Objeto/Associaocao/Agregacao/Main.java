package Objeto.Associaocao.Agregacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("João");
        Funcionarios funcionario2 = new Funcionarios("Joana");
        Funcionarios funcionario3 = new Funcionarios("Mateus");
        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(funcionario1);
        listaDeFuncionarios.add(funcionario2);
        listaDeFuncionarios.add(funcionario3);

        Departamento ti = new Departamento("TI ", listaDeFuncionarios);

        //declara uma list vazia
        Departamento marketing = new Departamento("Marketing ", Collections.emptyList());
    }



}
