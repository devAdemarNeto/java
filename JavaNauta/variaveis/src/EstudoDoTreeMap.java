import java.util.TreeMap;

public class EstudoDoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Alice",9.5);
        notasAlunos.put("Mateus",8.0);
        notasAlunos.put("Maria",7.5);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Ultima chave: " + notasAlunos.lastKey());
    }
}
