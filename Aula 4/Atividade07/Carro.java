public class Carro extends Veiculo {
    private int quantidadePortas;
    public Carro(String marca, int ano, int quantidadePortas) {
        super(marca, ano); this.quantidadePortas = quantidadePortas;
    }
    public void mostrarCarro() {
        System.out.println("Carro: " + getMarca());
        System.out.println("Portas: " + quantidadePortas);
    }
}
