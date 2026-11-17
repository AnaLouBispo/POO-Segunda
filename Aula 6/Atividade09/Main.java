public class Main {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        System.out.println("Normal: " + calculadora.calcular(new FreteNormal(), 2));
        System.out.println("Expresso: " + calculadora.calcular(new FreteExpresso(), 2));
        System.out.println("Internacional: " + calculadora.calcular(new FreteInternacional(), 2));
    }
}
