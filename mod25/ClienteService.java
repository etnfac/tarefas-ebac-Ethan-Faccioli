public class ClienteService {
    
    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    public Cliente buscarPorCPF(String cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }

    public void excluir(String cpf) {
        clienteDAO.excluir(cpf);
    }

    public void alterar(Cliente cliente) {
        clienteDAO.alterar(cliente);
    }
}