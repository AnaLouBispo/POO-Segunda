public class Jogo extends Produto {
    private String plataforma;
    public Jogo(String nome, double preco, String plataforma) {
        super(nome, preco);
        this.plataforma = plataforma;
    }
    public String getPlataforma() { return plataforma; }
    public void mostrarJogo() {
        mostrarDados();
        System.out.println("Plataforma: " + plataforma);
    }
}
