public class Cartao extends Pagamento implements Comprovante {
    public Cartao(double valor) { super(valor); }
    @Override
    public void processar() { System.out.printf("Pagamento no cartão de R$ %.2f processado.%n", valor); }
    @Override
    public void gerarComprovante() { System.out.printf("Comprovante cartão: R$ %.2f%n", valor); }
}
