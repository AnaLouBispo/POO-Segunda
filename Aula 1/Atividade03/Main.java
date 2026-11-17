public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Caderno";
        p1.preco = 25.50;
        p1.quantidade = 10;
        Produto p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 3.50;
        p2.quantidade = 30;
        p1.mostrarProduto();
        p2.mostrarProduto();
    }
}
