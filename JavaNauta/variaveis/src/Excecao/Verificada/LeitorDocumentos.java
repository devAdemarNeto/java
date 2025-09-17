package Excecao.Verificada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {
        //Classe responsavel pelo leitor de documentos
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\adema\\OneDrive\\DOCUMENTOS\\Repositorios\\Texto.txt"));

            // ler linha por linha do arquivo
            //null == inexistente
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo" + e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
