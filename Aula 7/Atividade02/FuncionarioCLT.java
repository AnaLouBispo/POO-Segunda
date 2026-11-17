public class FuncionarioCLT extends Funcionario {
    @Override
    public void trabalhar() { System.out.println("Funcionário CLT trabalhando."); }
    @Override
    public double calcularSalario() { return 3000; }
}
