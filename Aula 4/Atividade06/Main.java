public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("João", 4500, "POO");
        Gerente gerente = new Gerente("Maria", 6500, "Tecnologia");
        professor.mostrarDados();
        professor.ensinar();
        gerente.mostrarDados();
        gerente.gerenciar();
    }
}
