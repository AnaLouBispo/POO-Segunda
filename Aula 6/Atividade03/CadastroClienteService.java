public class CadastroClienteService {
    private final ClienteRepository repository;
    public CadastroClienteService(ClienteRepository repository) { this.repository = repository; }
    public Cliente cadastrar(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome obrigatório.");
        }
        Cliente cliente = new Cliente(nome);
        repository.salvar(cliente);
        return cliente;
    }
}
