package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("fileWriter.txt");
        try(FileWriter fw = new FileWriter(file, true);) {
            fw.write("Escrevendo no arquivo com FileWriter usando append\nContinua na próxima linha");
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
