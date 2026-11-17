public class Main {
    public static void main(String[] args) {
        Imprimivel impressora = new ImpressoraSimples();
        Escaneavel scanner = new Scanner();
        Multifuncional multi = new Multifuncional();
        impressora.imprimir();
        scanner.escanear();
        multi.imprimir();
        multi.escanear();
        multi.enviarFax();
    }
}
