public class Main {
    public static void main(String[] args) {
        java.util.ArrayList<Funcionario> funcionarios = new java.util.ArrayList<>();
        funcionarios.add(new Desenvolvedor("Maria", 5000));
        funcionarios.add(new Gerente("Carlos", 8000));
        funcionarios.add(new Desenvolvedor("Ana", 6000));
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Bônus: " + funcionario.calcularBonus());
        }
    }
}
