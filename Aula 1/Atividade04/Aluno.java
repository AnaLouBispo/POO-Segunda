public class Aluno {
    String nome;
    double nota1;
    double nota2;
    public void calcularMedia() {
        double media = (nota1 + nota2) / 2;
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
    }
}
