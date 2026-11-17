public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", 39.90, "Machado de Assis");
        Jogo jogo = new Jogo("Minecraft", 99.90, "PC");
        livro.mostrarLivro();
        jogo.mostrarJogo();
    }
}
