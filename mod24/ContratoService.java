public class ContratoService {
    
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    public String buscar(Long id) {
        return contratoDao.buscar(id);
    }

    public String excluir(Long id) {
        contratoDao.excluir(id);
        return "Excluido com sucesso";
    }

    public String atualizar(Long id) {
        contratoDao.atualizar(id);
        return "Atualizado com sucesso";
    }
}