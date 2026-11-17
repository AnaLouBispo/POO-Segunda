public class Main {
    public static void main(String[] args) {
        UsuarioService mysql = new UsuarioService(new MySQLDatabase());
        UsuarioService postgres = new UsuarioService(new PostgreSQLDatabase());
        mysql.cadastrar("Ana");
        postgres.cadastrar("Bruno");
    }
}
