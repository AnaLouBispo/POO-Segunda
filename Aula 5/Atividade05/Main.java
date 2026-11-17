public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic");
        Veiculo v1 = carro;
        Veiculo v2 = new Bicicleta("Caloi");
        v1.mover();
        v2.mover();
        carro.buzinar();
    }
}
