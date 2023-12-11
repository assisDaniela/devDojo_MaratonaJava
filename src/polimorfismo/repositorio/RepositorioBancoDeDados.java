package polimorfismo.repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
