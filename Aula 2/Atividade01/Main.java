public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Carlos", 20);
        Pessoa pessoa2 = new Pessoa("Maria", 25);
        pessoa1.apresentar();
        pessoa2.apresentar();
        pessoa1.setIdade(21);
        pessoa1.setIdade(-500);
        pessoa1.setNome("");
        System.out.println(pessoa1.getNome() + " agora tem " + pessoa1.getIdade() + " anos.");
        pessoa2.apresentar();
    }
}
