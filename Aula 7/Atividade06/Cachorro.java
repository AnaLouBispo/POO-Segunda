public class Cachorro implements Animal, Corredor, Nadador {
    @Override
    public void comer() { System.out.println("Cachorro comendo."); }
    @Override
    public void correr() { System.out.println("Cachorro correndo."); }
    @Override
    public void nadar() { System.out.println("Cachorro nadando."); }
}
