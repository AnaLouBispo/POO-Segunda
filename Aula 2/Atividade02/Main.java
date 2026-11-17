public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana");
        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.depositar(1000);
        conta.sacar(200);
        System.out.println("Depósito negativo aceito: " + conta.depositar(-100));
        System.out.println("Saque negativo aceito: " + conta.sacar(-10));
        System.out.println("Saque sem saldo aceito: " + conta.sacar(900));
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
