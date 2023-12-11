package interfaces;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe FileLoader");
    }
}
