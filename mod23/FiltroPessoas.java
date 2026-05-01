import java.util.ArrayList;
import java.util.List;

public class FiltroPessoas {

    public List<String> filtrarMulheres(List<String> listaCompleta) {
        List<String> listaMulheres = new ArrayList<>();
        
        listaCompleta.forEach(pessoa -> {
            String[] dados = pessoa.split("-");
            if (dados.length == 2) {
                String genero = dados[1].trim().toUpperCase();
                
                if (genero.equals("F")) {
                    listaMulheres.add(pessoa.trim());
                }
            }
        });
        
        return listaMulheres;
    }
}