public class PostgreSQLDatabase implements Repositorio {
    @Override
    public void salvar(String dados) { System.out.println("Salvando no PostgreSQL: " + dados); }
}
