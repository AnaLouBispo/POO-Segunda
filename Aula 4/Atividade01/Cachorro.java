public class Cachorro extends Animal {
    private String raca;
    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }
    public String getRaca() { return raca; }
    public void latir() { System.out.println(getNome() + ": Au au!"); }
}
