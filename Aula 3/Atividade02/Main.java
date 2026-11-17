public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("João", "Desenvolvimento de Software");
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", professor);
        disciplina.exibirDados();
    }
}
