public class PagamentoCartao implements Pagamento {
    @Override
    public void processar() { System.out.println("Cartão processado."); }
}
