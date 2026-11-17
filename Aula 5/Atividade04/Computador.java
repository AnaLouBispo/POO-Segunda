public class Computador implements Ligavel {
    @Override
    public void ligar() { System.out.println("O computador foi iniciado."); }
    @Override
    public void desligar() { System.out.println("O computador foi desligado."); }
}
