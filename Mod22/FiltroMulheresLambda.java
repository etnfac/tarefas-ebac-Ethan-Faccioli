import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiltroMulheresLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Filtro de Pessoas");
        System.out.println("Digite nomes e gêneros separados por vírgula (Ex: Facci - H, Letícia - F, Carlos - H): ");
        
        String entrada = scanner.nextLine();
        
        String[] arrayPessoas = entrada.split(",");
        
        List<String> todasAsPessoas = new ArrayList<>();
        for (String p : arrayPessoas) {
            todasAsPessoas.add(p.trim());
        }

        List<String> listaMulheres = new ArrayList<>();

        System.out.println("\nProcessando lista...");
        
        todasAsPessoas.forEach(pessoa -> {
            
            String[] dados = pessoa.split("-");
            
            if (dados.length == 2) {
                String nome = dados[0].trim();
                String genero = dados[1].trim().toUpperCase();
                
                if (genero.equals("F")) {
                    listaMulheres.add(nome);
                    System.out.println("[Adicionado] " + nome + " é mulher.");
                } else {
                    System.out.println("[Ignorado] " + nome + " não atende ao filtro.");
                }
            }
        });

        System.out.println("\nLISTA FINAL (APENAS MULHERES)");
        listaMulheres.forEach(mulher -> System.out.println(mulher));

        scanner.close();
    }
}