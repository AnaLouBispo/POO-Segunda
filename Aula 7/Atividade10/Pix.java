public class Pix implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento PIX: R$ %.2f%n", valor);
    }
}
