public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(250);
        System.out.println("Total: " + pedido.calcularTotal());
        new PedidoRepository().salvar(pedido);
        new EmailService().enviar(pedido);
        new NotaFiscalPrinter().imprimir(pedido);
    }
}
