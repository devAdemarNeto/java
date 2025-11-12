package NivelIntermediario.MetodosEParametros;

public class Ninja {
    String nome;
    String aldeia;
    int idade;


    public void SharinganAtivado() {
        System.out.println("O Sharingan Ativou");
    }

    public String euSouUmNinja(){
        return "Oi, eu sou um ninja!";
    }

    public int anosParaSeTornarHokage(int idadeMinima){
        return idadeMinima - idade;
    }
}



