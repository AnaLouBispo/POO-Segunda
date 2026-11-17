public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 2025, 4);
        Moto moto = new Moto("Honda", 2024, 300);
        carro.mostrarDados();
        carro.mostrarCarro();
        moto.mostrarDados();
        moto.mostrarMoto();
    }
}
