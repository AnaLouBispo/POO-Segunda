public class Main {
    public static void main(String[] args) {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        Colaborador[] equipe = {funcionario, new Voluntario()};
        for (Colaborador colaborador : equipe) { colaborador.trabalhar(); }
        Remuneravel remunerado = funcionario;
        System.out.println("Salário: " + remunerado.calcularSalario());
    }
}
