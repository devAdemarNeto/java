package NivelIntermediario.Desafio3;

public class Main {

    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Recuperar pergaminho roubado";
        sasuke.nivelDificuldade = "Rank A";
        sasuke.statusDaMissao = "Em andamento";
        sasuke.habilidadeEspecial = "Sharingan";
        sasuke.mostrarInformacoes();
    }

}
