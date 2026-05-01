public class ContratoDaoMock implements IContratoDao {
    
    @Override
    public void salvar() {
        // Simula o salvamento
    }

    @Override
    public String buscar(Long id) {
        return "Contrato Encontrado";
    }

    @Override
    public void excluir(Long id) {
    }

    @Override
    public void atualizar(Long id) {
    }
}