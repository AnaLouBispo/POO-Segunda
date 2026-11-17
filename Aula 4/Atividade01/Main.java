public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", "Labrador");
        System.out.println("Raça: " + cachorro.getRaca());
        cachorro.emitirSom();
        cachorro.latir();
    }
}
