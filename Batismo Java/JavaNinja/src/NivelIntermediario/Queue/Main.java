package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> ninjasQueue = new LinkedList<>();

        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        //Mostrar a fila
        System.out.println("Ninjas na fila" + ninjasQueue);

        //Tirar um ninja
        //poll - tira o primeiro elemento (head) da lista
        ninjasQueue.poll();
        System.out.println("Ninjas na fila após o pool" + ninjasQueue);

        //Como verificar o primeiro elemento
        System.out.println("Ninjas no HEAD" + ninjasQueue.peek());

        //AAdicionar elemento

        ninjasQueue.add("Hashirama");
        ninjasQueue.add("Tobirama");
        System.out.println("Ninjas na fila" + ninjasQueue);

        //Verificar se a fila está vazia
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila está vazia");
        }

    }
}
