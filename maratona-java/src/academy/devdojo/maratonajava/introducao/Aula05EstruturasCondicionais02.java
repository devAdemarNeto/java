package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    // idade < 15 categoria infantil
    // idade >= 15 $$ idade < 18 categoria juvenil
    // idade >= 18 categoria adulto
    public static void main(String[] args) {
        int idade = 17;
        String categoria;
        if(idade < 15){
            categoria = "Categoia infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria adulto";

        }
    }


}
