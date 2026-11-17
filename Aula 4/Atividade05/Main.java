public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 20, "ADS", "2026001");
        Aluno a2 = new Aluno("Bruno", 22, "Sistemas de Informação", "2026002");
        Professor professor = new Professor("Carlos", 40, "POO", 5000);
        a1.mostrarAluno();
        a2.mostrarAluno();
        professor.mostrarProfessor();
    }
}
