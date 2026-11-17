public class Carro extends Veiculo implements Motorizavel {
    @Override
    public void mover() { System.out.println("Carro em movimento."); }
    @Override
    public void ligarMotor() { System.out.println("Motor ligado."); }
}
