public class VendaService {
    private final Notificador notificador;
    public VendaService(Notificador notificador) {
        this.notificador = java.util.Objects.requireNonNull(notificador);
    }
    public void realizarVenda() {
        System.out.println("Venda realizada.");
        notificador.enviar("Compra realizada!");
    }
}
