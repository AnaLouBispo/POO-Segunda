public class Gerente extends Funcionario {
    private String setor;
    public Gerente(String nome, double salario, String setor) {
        super(nome, salario); this.setor = setor;
    }
    public void gerenciar() { System.out.println(getNome() + " está gerenciando " + setor); }
}
