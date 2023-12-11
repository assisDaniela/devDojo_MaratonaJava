package polimorfismo;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }


}
