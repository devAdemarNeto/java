import java.util.ArrayList;

public class Aula5ArraysListasArrayListEx02 {
    public static void main(String[] args) {
        ArrayList<String> jutsus = new ArrayList<>();
        jutsus.add("Rasegan");
        jutsus.add("Chidori");
        jutsus.add("Clone das sombras");

        for (int i = 0; i < jutsus.toArray().length; i++) {
            System.out.println(jutsus.get(i));
        }
    }
}
