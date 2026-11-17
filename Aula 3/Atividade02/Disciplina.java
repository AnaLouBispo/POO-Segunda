public class Disciplina {
    private String nome;
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void exibirDados() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Especialidade: " + professor.getEspecialidade());
    }
}
