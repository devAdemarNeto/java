package Desafios.Desafio6;

import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        LinkedList<Ninja> listNinjas = new LinkedList<Ninja>();

        listNinjas.add(new Ninja("Naruto", 17, "Folha"));
        listNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listNinjas.add(new Ninja("Temari", 18, "Areia"));


        //Listar ninjas
        //Complexidade o(n)
        System.out.println("---------- Lista de ninjas-----------" );
        for (Ninja ninja : listNinjas) {
            System.out.println(ninja);
        }

        //adicionar um nija no inicio da list
        listNinjas.addFirst(new Ninja("Boruto",9, "Folha"));

        //Remover um ninja no inicio da list
        Ninja removido = listNinjas.removeFirst();
        System.out.println("Ninja removido" + removido);

        //Listar ninjas
        //Complexidade o(n)
        System.out.println("---------- Lista de ninjas atualizada-----------" );
        for (Ninja listaNinjaAtualizada : listNinjas) {
            System.out.println(listaNinjaAtualizada);
        }

        //Procurar um ninja por indice
        Ninja terceiroNinja = listNinjas.get(2);






    }





}
