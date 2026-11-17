import java.util.ArrayList;
public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos;
    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno) { alunos.add(aluno); }
    public void listarAlunos() {
        System.out.println("Turma: " + nome);
        for (Aluno aluno : alunos) { System.out.println(aluno.getNome()); }
    }
}
