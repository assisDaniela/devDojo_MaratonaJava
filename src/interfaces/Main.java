package interfaces;

public class Main {
    public static void main(String[] args) {
        DatasetLoader datasetLoader = new DatasetLoader();
        FileLoader fileLoader = new FileLoader();

        datasetLoader.load();
        fileLoader.load();

        datasetLoader.remove();
        fileLoader.remove();

        datasetLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        FileLoader.retrieveMaxDataSize();
    }
}
