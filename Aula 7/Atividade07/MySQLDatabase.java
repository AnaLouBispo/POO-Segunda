public class MySQLDatabase implements Repositorio {
    @Override
    public void salvar(String dados) { System.out.println("Salvando no MySQL: " + dados); }
}
