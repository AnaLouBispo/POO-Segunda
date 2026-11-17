public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("POO");
        Turma turma = new Turma("Turma A");
        turma.adicionarAluno(new Aluno("Ana", curso));
        turma.adicionarAluno(new Aluno("Bruno", curso));
        turma.adicionarAluno(new Aluno("Carlos", curso));
        turma.listarAlunos();
    }
}
