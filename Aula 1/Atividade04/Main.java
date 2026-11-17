public class Main {
    public static void main(String[] args) {
        Aluno ana = new Aluno();
        ana.nome = "Ana";
        ana.nota1 = 8;
        ana.nota2 = 6;
        Aluno bruno = new Aluno();
        bruno.nome = "Bruno";
        bruno.nota1 = 5;
        bruno.nota2 = 7;
        ana.calcularMedia();
        bruno.calcularMedia();
    }
}
