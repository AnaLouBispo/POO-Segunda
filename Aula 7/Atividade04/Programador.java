public class Programador implements Trabalhavel, Programavel {
    @Override
    public void trabalhar() { System.out.println("Programador trabalhando."); }
    @Override
    public void programar() { System.out.println("Programador escrevendo código."); }
}
