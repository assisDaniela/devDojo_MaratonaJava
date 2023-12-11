package polimorfismo.repositorio;

public class RepositorioArquivo implements Repositorio {
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
