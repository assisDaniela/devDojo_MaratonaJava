package varargs;

public class Varargs {
    public static int somaComArray(int[] array) {
        int soma = 0;
        for(int i=0; i<array.length; i++) {
            soma += array[i];
        }

        return soma;
    }

    // Usando varargs
    public static int somaComVarArgs(int... numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }

        return soma;
    }

    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5};
        int soma1 = somaComArray(numeros);
        int soma2 = somaComVarArgs(numeros);
        int soma3 = somaComVarArgs(1, 2, 3, 4, 5);

        System.out.printf("%d; %d; %d\n", soma1, soma2, soma3);
    }
}
