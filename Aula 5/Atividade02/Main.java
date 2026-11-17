public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Professor("Carlos");
        Funcionario f2 = new Programador("Maria");
        f1.trabalhar();
        f2.trabalhar();
    }
}
