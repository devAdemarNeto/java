package Desafios.Desafio6_1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class GerenciadorNinja {
    private LinkedList<Ninja> listaNinja = new LinkedList<>();

    public void inicializarListaComSeteNinjas(){
        listaNinja.clear();

        listaNinja.add(new Ninja("Naruto", 17, "Folha"));
        listaNinja.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaNinja.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaNinja.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaNinja.add(new Ninja("Gaara", 17, "Areia"));
        listaNinja.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaNinja.add(new Ninja("Temari", 18, "Areia"));
    }

    public void adicionarNinja(String nome, int idade , String vila){
        Ninja novoNinja = new Ninja(nome,idade,vila);
        listaNinja.addFirst(novoNinja);
        System.out.println("Ninja adicionada no inicio: " + novoNinja);

    }

    public void removerNinjaInicio(){
        if (listaNinja.isEmpty()){
            System.out.println("Não há ninjas para remover");
            return;
        }
        Ninja ninjaRemovido = listaNinja.removeFirst();
        System.out.println("Ninja removido: " + ninjaRemovido);
    }

    public void listarNinjas(){
        for (Ninja ninja: listaNinja) {
            System.out.println(ninja);
        }
    }

    public void acessarNinja(int posicao){

        if (posicao < 0 && posicao >= listaNinja.size()){
            System.out.println("Posição fora do limite da lista");
            return;
        }
        Ninja acessoNinja = listaNinja.get(posicao);
        System.out.println("Ninja na posição " + posicao + ": " + acessoNinja);
    }

    public void ordenarPor(String criterio) {
        switch (criterio.toLowerCase()) {
            case "nome":
                Collections.sort(listaNinja, Comparator.comparing(Ninja::getNome));
                break;

            case "idade":
                Collections.sort(listaNinja, Comparator.comparingInt(Ninja::getIdade));
                break;

            case "vila":
                Collections.sort(listaNinja, Comparator.comparing(Ninja::getVila));
                break;

            default:
                System.out.println("Critério inválido! Use: nome, idade ou vila.");
                return;
        }

        System.out.println("Lista ordenada por " + criterio + ":");
        listarNinjas();
    }







}
