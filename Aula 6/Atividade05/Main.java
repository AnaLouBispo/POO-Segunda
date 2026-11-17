public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Ana");
        System.out.println("Total do pedido vazio: " + pedido.calcularTotal());
        pedido.adicionarProduto(new Produto("Notebook", 3500));
        pedido.adicionarProduto(new Produto("Mouse", 80));
        pedido.adicionarProduto(new Produto("Teclado", 150));
        pedido.listarProdutos();
        System.out.println("Total conferido: " + pedido.calcularTotal());
        java.util.ArrayList<Pagamento> pagamentos = new java.util.ArrayList<>();
        pagamentos.add(new PagamentoPix());
        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoBoleto());
        pagamentos.add(new PagamentoValePresente());
        PagamentoService service = new PagamentoService();
        for (Pagamento pagamento : pagamentos) { service.processar(pagamento, pedido.calcularTotal()); }
        new PedidoRepository().salvar(pedido);
        new EmailService().enviar(pedido);
        new RelatorioPedido().gerarPdf(pedido);
    }
}
