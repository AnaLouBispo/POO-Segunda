public class Professor extends Funcionario {
    private String disciplina;
    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario); this.disciplina = disciplina;
    }
    public void ensinar() { System.out.println(getNome() + " está ensinando " + disciplina); }
}
