public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pix();
        Notificador notificador = new EmailNotificador();
        PedidoService pedido = new PedidoService(pagamento, notificador);
        pedido.finalizarPedido(500);
        pagamento = new Cartao();
        notificador = new SmsNotificador();
        new PedidoService(pagamento, notificador).finalizarPedido(500);
        System.out.println("Todas as combinações:");
        Pagamento[] pagamentos = {new Pix(), new Cartao(), new Boleto()};
        Notificador[] canais = {new EmailNotificador(), new SmsNotificador(), new WhatsAppNotificador()};
        for (Pagamento forma : pagamentos) {
            for (Notificador canal : canais) {
                new PedidoService(forma, canal).finalizarPedido(500);
            }
        }
    }
}
