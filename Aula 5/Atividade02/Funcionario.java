public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando.");
    }
}
