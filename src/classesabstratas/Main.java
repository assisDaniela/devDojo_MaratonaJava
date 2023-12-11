package classesabstratas;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Nami", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Touya", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.calculaBonus();
        desenvolvedor.calculaBonus();

        System.out.println();
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
