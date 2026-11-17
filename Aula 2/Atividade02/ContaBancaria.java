public class ContaBancaria {
    private String titular;
    private double saldo;
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public boolean depositar(double valor) {
        if (!Double.isNaN(valor) && !Double.isInfinite(valor) && valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
