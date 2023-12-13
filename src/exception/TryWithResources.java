package exception;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {

    }

    public static void lerArquivo() throws IOException {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
