public class Programador extends Funcionario {
    public Programador(String nome) { super(nome); }
    @Override
    public void trabalhar() { System.out.println(getNome() + " está programando."); }
}
