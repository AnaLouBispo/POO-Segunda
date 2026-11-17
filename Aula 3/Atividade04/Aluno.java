public class Aluno {
    private String nome;
    private Curso curso;
    public Aluno(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }
    public String getNome() { return nome; }
    public void exibirDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso.getNome());
    }
}
