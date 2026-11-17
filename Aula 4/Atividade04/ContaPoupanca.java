public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    public ContaPoupanca(String titular, double taxaRendimento) {
        super(titular);
        this.taxaRendimento = taxaRendimento;
    }
    public double getTaxaRendimento() { return taxaRendimento; }
}
