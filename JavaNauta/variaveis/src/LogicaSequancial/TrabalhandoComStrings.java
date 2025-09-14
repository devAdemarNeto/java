package LogicaSequancial;

public class TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Joana";
        String nomeDois = "Joana";

        int tamanhoDaString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);

        System.out.println("Olá " + nome);
        System.out.println("Olá " + nome + " seu nome tem " + tamanhoDaString + " caracteres");
        System.out.println("Os nomes são iguais?:  " + saoIguais);
    }
}
