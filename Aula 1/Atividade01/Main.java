public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 20;
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.idade = 19;
        pessoa1.apresentar();
        pessoa2.apresentar();
        pessoa1.nome = "José";
        System.out.println("Após alterar pessoa1: " + pessoa1.nome);
        System.out.println("pessoa2 continua: " + pessoa2.nome);
    }
}
