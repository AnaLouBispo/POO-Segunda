public class DesenvolvedorService {
    private final Trabalhavel trabalhador;
    private final Programavel programador;
    public DesenvolvedorService(Trabalhavel trabalhador, Programavel programador) {
        this.trabalhador = java.util.Objects.requireNonNull(trabalhador);
        this.programador = java.util.Objects.requireNonNull(programador);
    }
    public void executar() {
        trabalhador.trabalhar();
        programador.programar();
    }
}
