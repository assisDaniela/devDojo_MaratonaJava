package polimorfismo;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
