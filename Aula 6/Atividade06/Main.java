public class Main {
    public static void main(String[] args) {
        java.util.ArrayList<Produto> produtos = new java.util.ArrayList<>();
        produtos.add(new Produto("Notebook", 3500));
        produtos.add(new Produto("Mouse", 80));
        produtos.add(new Produto("Teclado", 150));
        produtos.add(new Produto("Monitor", 900));
        produtos.add(new Produto("Headset", 200));
        for (Produto produto : produtos) { produto.exibirDados(); }
        System.out.println("Quantidade de produtos: " + produtos.size());
        System.out.println("Busca por mouse:");
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase("mouse")) { produto.exibirDados(); }
        }
    }
}
