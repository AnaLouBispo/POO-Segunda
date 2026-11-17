public class Main {
    public static void main(String[] args) {
        Voador[] voadores = {new Passaro(), new Aviao(), new Drone()};
        for (Voador voador : voadores) { voador.voar(); }
    }
}
