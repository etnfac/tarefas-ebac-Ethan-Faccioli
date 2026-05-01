public interface IClienteDAO {
    Boolean salvar(Cliente cliente);
    Cliente buscarPorCPF(String cpf);
    void excluir(String cpf);
    void alterar(Cliente cliente);
}