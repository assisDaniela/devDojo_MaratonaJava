package polimorfismo.repositorio;

public class RepositorioMemoria implements Repositorio {
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
