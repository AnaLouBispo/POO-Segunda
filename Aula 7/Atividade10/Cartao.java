public class Cartao implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento com cartão: R$ %.2f%n", valor);
    }
}
