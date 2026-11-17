public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    public String getDisciplina() { return disciplina; }
    public double getSalario() { return salario; }
    public void mostrarProfessor() {
        apresentar();
        System.out.println("Disciplina: " + disciplina);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }
}
