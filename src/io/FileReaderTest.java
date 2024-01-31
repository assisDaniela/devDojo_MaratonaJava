package io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("fileWriter.txt");

        try(FileReader fr = new FileReader(file);) {
            // Buffer para os primeiros 20 caracteres
            char[] in = new char[20];
            fr.read(in);
            for(char c : in) {
                System.out.print(c);
            }

            System.out.println();

            // iterar até o fim do arquivo marcado pelo inteiro -1
            int i;
            while((i=fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
