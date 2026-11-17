public class Aluno extends Pessoa {
    private String curso;
    private String matricula;
    public Aluno(String nome, int idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }
    public String getCurso() { return curso; }
    public String getMatricula() { return matricula; }
    public void mostrarAluno() {
        apresentar();
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
    }
}
