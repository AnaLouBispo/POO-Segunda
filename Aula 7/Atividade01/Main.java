public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Veiculo[] veiculos = {carro, new Bicicleta()};
        for (Veiculo veiculo : veiculos) { veiculo.mover(); }
        Motorizavel motorizado = carro;
        motorizado.ligarMotor();
    }
}
