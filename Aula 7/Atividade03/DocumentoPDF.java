public class DocumentoPDF extends Documento implements Imprimivel {
    @Override
    public void visualizar() { System.out.println("Visualizando documento PDF."); }
    @Override
    public void imprimir() { System.out.println("Imprimindo documento PDF."); }
}
