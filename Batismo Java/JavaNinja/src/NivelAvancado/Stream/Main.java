package NivelAvancado.Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();

        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 17));
        ninjas.add(new Ninja("Kakashi Hataki", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 18));
        ninjas.add(new Ninja("Temati", "Suna", 19));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 17));

//        for (int i = 0; i < ninjas.size(); i++) {
//            System.out.println(ninjas);
//        }

        // Utilizando stream no lugar do for .stream

        // FILTE - Filtragem dos ninjas por vila
//        ninjas.stream()
//                .filter(ninja -> ninja.getVila().equals("Konoha"))
//                .forEach(System.out::println); // soutc

        //SORTED - Ordemação por idade
//        ninjas.stream()
//                .sorted((n1,n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
//                .forEach(System.out::println);

        //Ordenação por ORdem alfabetica

//        ninjas.stream()
//                .sorted((n1, n2) -> n1.getNome() .compareTo(n2.getNome()))
//                .forEach(System.out::println);

//        // MAP -  mostrar e mapear um atributo
//        ninjas.stream()
//                .map(Ninja::getNome)
//                .forEach(System.out::println);

        // MAX - Filtrar por ninja mais velhos
        Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1,n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);
        System.out.println("Ninja mais velho = " + ninjaMaisVelho);
    }
}
