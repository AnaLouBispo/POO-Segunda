public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        DesenvolvedorService service = new DesenvolvedorService(desenvolvedor, desenvolvedor);
        service.executar();
    }
}
