public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Sistemas de Informação");
        Aluno carlos = new Aluno("Carlos", curso);
        Aluno ana = new Aluno("Ana", curso);
        carlos.exibirDados();
        ana.exibirDados();
    }
}
