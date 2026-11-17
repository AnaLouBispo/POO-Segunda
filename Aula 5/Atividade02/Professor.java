public class Professor extends Funcionario {
    public Professor(String nome) { super(nome); }
    @Override
    public void trabalhar() { System.out.println(getNome() + " está ensinando."); }
}
