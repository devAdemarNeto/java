package Excecao;

public class ConflictExcepition extends RuntimeException{
    public ConflictExcepition(String mensagem){
        super(mensagem);
    }

    public ConflictExcepition(String mensagem,Throwable causa ){
        super(mensagem, causa);
    }
}
