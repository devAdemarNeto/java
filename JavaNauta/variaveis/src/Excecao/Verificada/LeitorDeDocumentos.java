package Excecao.Verificada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class LeitorDeDocumentos {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\adema\\OneDrive\\DOCUMENTOS\\Repositorios\\Texto.txt"));


            // ler o arquivo
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
