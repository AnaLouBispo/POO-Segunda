public class PedidoService {
    private final Pagamento pagamento;
    private final Notificador notificador;
    public PedidoService(Pagamento pagamento, Notificador notificador) {
        this.pagamento = java.util.Objects.requireNonNull(pagamento);
        this.notificador = java.util.Objects.requireNonNull(notificador);
    }
    public void finalizarPedido(double valor) {
        pagamento.pagar(valor);
        notificador.enviar("Pedido realizado com sucesso.");
    }
}
