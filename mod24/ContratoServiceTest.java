import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void testSalvar() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void testBuscar() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        
        String retorno = service.buscar(1L);
        Assert.assertEquals("Contrato Encontrado", retorno);
    }

    @Test
    public void testExcluir() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        
        String retorno = service.excluir(1L);
        Assert.assertEquals("Excluido com sucesso", retorno);
    }

    @Test
    public void testAtualizar() {
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        
        String retorno = service.atualizar(1L);
        Assert.assertEquals("Atualizado com sucesso", retorno);
    }
}