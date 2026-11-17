public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente("Ana", 500);
        ContaPoupanca poupanca = new ContaPoupanca("Bruno", 0.005);
        corrente.depositar(1000);
        poupanca.depositar(2000);
        corrente.mostrarSaldo();
        System.out.println("Limite: R$ " + corrente.getLimite());
        poupanca.mostrarSaldo();
        System.out.println("Taxa: " + (poupanca.getTaxaRendimento() * 100) + "%");
    }
}
