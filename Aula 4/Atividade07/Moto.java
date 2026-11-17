public class Moto extends Veiculo {
    private int cilindradas;
    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano); this.cilindradas = cilindradas;
    }
    public void mostrarMoto() {
        System.out.println("Moto: " + getMarca());
        System.out.println("Cilindradas: " + cilindradas);
    }
}
