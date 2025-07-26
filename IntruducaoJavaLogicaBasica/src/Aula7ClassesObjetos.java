
class Ninja{
    String nome;
    String cla;
    double chakra;
    String especialidade;
}

public class Aula7ClassesObjetos {

    public static void main(String[] args) {
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        naruto.cla = "Usumaki";
        naruto.chakra = 9000;
        naruto.especialidade = "Rasegan";

        Ninja sasuke = new Ninja();
        sasuke.nome ="Sasuke";
        sasuke.cla = "Uchiha";
        sasuke.chakra = 8000;
        sasuke.especialidade = "Chidori";


        Ninja sakura = new Ninja();
        sakura.nome ="Sakura";
        sakura.cla = "Haruno";
        sakura.chakra = 7000;
        sakura.especialidade = "Jutsu Médico";


        System.out.println("Ninjas Criados: ");
        System.out.println(naruto.nome + " | Clã: "+ naruto.cla + " | Chakra: " + naruto.chakra + " | Especialidade: " + naruto.especialidade);
        System.out.println(sasuke.nome + " | Clã: "+ sasuke.cla + " | Chakra: " + sasuke.chakra + " | Especialidade: " + sasuke.especialidade);
        System.out.println(sakura.nome + " | Clã: "+ sakura.cla + " | Chakra: " + sakura.chakra + " | Especialidade: " + sakura.especialidade);
    }
}
