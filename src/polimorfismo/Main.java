package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10, "23/12/2023");
        Produto produto1 = new Computador("Ryzen 9", 1100);
        Produto produto2 = new Tomate("Tomate Cereja", 13, "21/12/2023");

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("\n-----------------------------------\n");
        CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println("\n-----------------------------------\n");
        CalculadoraImposto.calcularImposto(produto1);
        System.out.println("\n-----------------------------------\n");
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println("\n-----------------------------------\n");

        Produto produto = new Computador("Acer Nitro", 3500);
        Tomate tomate1 = new Tomate("Americano", 20, "20/12/2023");

        CalculadoraImposto.calcularImposto(tomate1);
        System.out.println("\n-----------------------------------\n");
    }
}
