public class Multifuncional implements Imprimivel, Escaneavel, Fax {
    @Override
    public void imprimir() { System.out.println("Multifuncional imprimindo."); }
    @Override
    public void escanear() { System.out.println("Multifuncional digitalizando."); }
    @Override
    public void enviarFax() { System.out.println("Multifuncional enviando fax."); }
}
