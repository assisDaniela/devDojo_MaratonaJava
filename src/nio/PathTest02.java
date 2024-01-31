package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        // Criação de diretórios
        Path pastaPath = Paths.get("pasta"); // new File("pasta");
        if(Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        Path subPastaPath = Paths.get("pasta/subpasta/subsub");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);

        // Criação de arquivo
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if(Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        // Cópia de arquivo
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        // Sobrescreve arquivo de mesmo nove
        // terceiro parâmetro é opcional, se não informado e existir um target de mesmo nome
        // é lançada uma exceção
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
