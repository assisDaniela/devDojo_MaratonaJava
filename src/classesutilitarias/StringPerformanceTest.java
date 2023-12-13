package classesutilitarias;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para String " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatWithStringBuilder(100_000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + " ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";

        for(int i=0; i<tamanho; i++) {
            texto += i;
        }
    }

    private static void concatWithStringBuilder(int tamanho) {
        StringBuilder texto = new StringBuilder(tamanho);

        for(int i=0; i<tamanho; i++) {
            texto.append(i);
        }

        String textoString = texto.toString();
    }
}
