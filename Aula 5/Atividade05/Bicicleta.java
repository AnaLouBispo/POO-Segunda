public class Bicicleta extends Veiculo {
    public Bicicleta(String modelo) { super(modelo); }
    @Override
    public void mover() { System.out.println(getModelo() + " está sendo pedalada."); }
}
