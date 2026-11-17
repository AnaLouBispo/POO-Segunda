public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador();
        Trabalhavel trabalhador = programador;
        Programavel profissional = programador;
        trabalhador.trabalhar();
        profissional.programar();
    }
}
