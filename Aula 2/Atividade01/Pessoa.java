public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome, int idade) {
        if (nome == null || nome.trim().isEmpty() || idade < 0) {
            throw new IllegalArgumentException("Nome e idade inválidos.");
        }
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) { this.nome = nome; }
    }
    public void setIdade(int idade) {
        if (idade >= 0) { this.idade = idade; }
    }
    public void apresentar() {
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
