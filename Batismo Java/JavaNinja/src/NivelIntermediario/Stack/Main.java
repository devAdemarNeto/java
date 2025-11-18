package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // Sao estaticos e tem ref de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas
        // Sao dinamicas e tamanho aumnta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        //push - adicionar elemnto na pilha
        //pop - remover elemento do topo da lista
        //peek - verificar o próximo elemento do topo na list
        //size - quantidade de elementos na lista
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Hinata Hyuga");
        ninjaStack.push("Kakashi Hatake");
        System.out.println("Minha Stack Atual = " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha Stack Atualizada com pop = " + ninjaStack);
        System.out.println("Minha Stack com o proximo elemnto do topo = " + ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size() + " elementos.");

        System.out.println("Minha Stack Atual = " + ninjaStack);








    }
}
