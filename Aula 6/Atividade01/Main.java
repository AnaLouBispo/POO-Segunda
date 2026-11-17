public class Main {
    public static void main(String[] args) {
        java.util.ArrayList<Livro> livros = new java.util.ArrayList<>();
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 39.90));
        livros.add(new Livro("O Cortiço", "Aluísio Azevedo", 29.90));
        livros.add(new Livro("Iracema", "José de Alencar", 50));
        livros.add(new Livro("Java para Iniciantes", "Herbert Schildt", 120));
        livros.add(new Livro("A Hora da Estrela", "Clarice Lispector", 45));
        System.out.println("Todos os livros:");
        for (Livro livro : livros) { livro.exibirDados(); }
        System.out.println("Quantidade: " + livros.size());
        for (String titulo : new String[]{"dom casmurro", "Livro inexistente"}) {
            System.out.println("Busca: " + titulo);
            boolean encontrado = false;
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livro.exibirDados();
                    encontrado = true;
                }
            }
            if (!encontrado) { System.out.println("Livro não encontrado."); }
        }
        System.out.println("Livros com preço menor que R$ 50:");
        for (Livro livro : livros) {
            if (livro.getPreco() < 50) { livro.exibirDados(); }
        }
    }
}
