package Excecao.Naoverificada;

import java.util.Scanner;

public class VerificaCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu CPF");
        String verificaCPF = verificaCPF(scanner.nextLine());
        System.out.println(verificaCPF);



    }

    public static String verificaCPF(String cpf){
        try {
            if (cpf.equals("00012512378")){
                throw new RuntimeException("CPF já cadastrado " + cpf);
            }else{
                return "CPF válido, usuário cadastrao";
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("CPF já cadastrado");
        }

    }
}
