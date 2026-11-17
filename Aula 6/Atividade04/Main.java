public class Main {
    public static void main(String[] args) {
        java.util.ArrayList<Pagamento> pagamentos = new java.util.ArrayList<>();
        pagamentos.add(new PagamentoPix());
        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoBoleto());
        for (Pagamento pagamento : pagamentos) { pagamento.processar(); }
    }
}
