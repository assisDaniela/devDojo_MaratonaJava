package polimorfismo;

import polimorfismo.repositorio.Repositorio;
import polimorfismo.repositorio.RepositorioBancoDeDados;
import polimorfismo.repositorio.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
