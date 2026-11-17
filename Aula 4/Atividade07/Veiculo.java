public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}
