import java.util.ArrayList;

public class Aula5ArraysListasArrayListEx03 {
    public static void main(String[] args) {
        ArrayList<String> jutsus = new ArrayList<>();
        jutsus.add("Kage Bunshin no Jutsu");
        jutsus.add("Rasenshuriken");

        System.out.println("Quantidade de jutsus: " + jutsus.size());
        System.out.println("Primeiro jutsu: " + jutsus.get(0));
        System.out.println("Ultimo jutsu: " + jutsus.get(jutsus.size()-1));
    }
}
