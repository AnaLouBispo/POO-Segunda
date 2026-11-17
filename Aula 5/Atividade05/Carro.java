public class Carro extends Veiculo implements Buzinavel {
    public Carro(String modelo) { super(modelo); }
    @Override
    public void mover() { System.out.println(getModelo() + " está andando com motor."); }
    @Override
    public void buzinar() { System.out.println(getModelo() + ": Bii bii!"); }
}
