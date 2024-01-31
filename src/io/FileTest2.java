package io;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");

        boolean canCreateFile = (fileDiretorio.exists() || fileDiretorio.mkdir());

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        if(canCreateFile) {
            boolean isCreated = fileArquivoDiretorio.createNewFile();
            System.out.println(isCreated);
        }

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("pasta_renomeada");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }
}
