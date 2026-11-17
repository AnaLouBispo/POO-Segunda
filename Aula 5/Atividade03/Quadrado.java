public class Quadrado extends Forma {
    private double lado;
    public Quadrado(double lado) { this.lado = lado; }
    @Override
    public void calcularArea() { System.out.println("Área do quadrado: " + (lado * lado)); }
}
