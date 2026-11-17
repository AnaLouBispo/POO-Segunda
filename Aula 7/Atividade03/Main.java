public class Main {
    public static void main(String[] args) {
        DocumentoPDF pdf = new DocumentoPDF();
        Documento[] documentos = {pdf, new DocumentoDigital()};
        for (Documento documento : documentos) { documento.visualizar(); }
        Imprimivel imprimivel = pdf;
        imprimivel.imprimir();
    }
}
