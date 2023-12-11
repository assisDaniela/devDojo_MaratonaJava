package enums;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente1", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Cliente2", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

//        System.out.println(cliente1);
//        System.out.println(cliente2);
//        System.out.println(cliente1.getTipoPagamento().calcularDesconto(1000));
//        System.out.println(cliente2.getTipoPagamento().calcularDesconto(1000));

        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio(cliente1.getTipoCliente().getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio(cliente2.getTipoCliente().getNomeRelatorio());

        System.out.println(tipoCliente1);
        System.out.println(tipoCliente2);
    }
}
