import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FiltroPessoasTest {

    @Test
    public void testGarantirQueSoExistemMulheresNaLista() {
        FiltroPessoas filtro = new FiltroPessoas();
        List<String> listaMista = Arrays.asList("Carlos - M", "Letícia - F", "Facci - M", "Amanda - F");

        List<String> resultado = filtro.filtrarMulheres(listaMista);

        Assert.assertEquals(2, resultado.size());

        for (String pessoa : resultado) {
            String[] dados = pessoa.split("-");
            String genero = dados[1].trim().toUpperCase();
            
            Assert.assertEquals("O gênero dentro da lista deve ser apenas F", "F", genero);
        }
    }
}