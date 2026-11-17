public class Main {
    public static void main(String[] args) {
        CadastroClienteService cadastro = new CadastroClienteService(new ClienteRepository());
        Cliente cliente = cadastro.cadastrar("Ana");
        new EmailService().enviar(cliente);
        new RelatorioCliente().gerarPdf(cliente);
    }
}
