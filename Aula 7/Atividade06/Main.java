public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Aguia aguia = new Aguia();
        Peixe peixe = new Peixe();
        Animal[] animais = {cachorro, aguia, peixe};
        for (Animal animal : animais) { animal.comer(); }
        cachorro.correr();
        cachorro.nadar();
        aguia.voar();
        peixe.nadar();
    }
}
