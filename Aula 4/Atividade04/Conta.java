public class Conta {
    private String titular;
    private double saldo;
    public Conta(String titular) { this.titular = titular; this.saldo = 0; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public void depositar(double valor) {
        if (valor > 0 && !Double.isInfinite(valor)) { saldo += valor; }
    }
    public void mostrarSaldo() {
        System.out.printf("%s - Saldo: R$ %.2f%n", titular, saldo);
    }
}
