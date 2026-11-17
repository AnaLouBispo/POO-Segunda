public class UsuarioService {
    private final Repositorio banco;
    public UsuarioService(Repositorio banco) {
        this.banco = java.util.Objects.requireNonNull(banco);
    }
    public void cadastrar(String nome) { banco.salvar(nome); }
}
