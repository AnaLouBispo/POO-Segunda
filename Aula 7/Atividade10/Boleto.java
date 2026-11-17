public class Boleto implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento com boleto: R$ %.2f%n", valor);
    }
}
