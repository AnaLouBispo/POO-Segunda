public class Main {
    public static void main(String[] args) {
        Pix pix1 = new Pix(100);
        Cartao cartao = new Cartao(250);
        Pix pix2 = new Pix(80);
        java.util.ArrayList<Pagamento> pagamentos = new java.util.ArrayList<>();
        pagamentos.add(pix1);
        pagamentos.add(cartao);
        pagamentos.add(pix2);
        for (Pagamento pagamento : pagamentos) { pagamento.processar(); }
        Comprovante[] comprovantes = {pix1, cartao, pix2};
        for (Comprovante comprovante : comprovantes) { comprovante.gerarComprovante(); }
    }
}
