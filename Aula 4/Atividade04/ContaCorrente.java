public class ContaCorrente extends Conta {
    private double limite;
    public ContaCorrente(String titular, double limite) {
        super(titular);
        this.limite = limite;
    }
    public double getLimite() { return limite; }
}
