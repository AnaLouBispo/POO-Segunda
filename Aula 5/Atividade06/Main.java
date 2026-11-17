public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Desenvolvedor();
        f1.trabalhar();
        f2.trabalhar();
    }
}
