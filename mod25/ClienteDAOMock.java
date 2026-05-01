public class ClienteDAOMock implements IClienteDAO {

    @Override
    public Boolean salvar(Cliente cliente) {
        return true; 
    }

    @Override
    public Cliente buscarPorCPF(String cpf) {
        return new Cliente(cpf, "Nome Teste", "Papanduva", "SC");
    }

    @Override
    public void excluir(String cpf) {
        // Simula exclusão
    }

    @Override
    public void alterar(Cliente cliente) {
    }
}