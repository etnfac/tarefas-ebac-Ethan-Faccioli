import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NomesPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Divisão de Grupos por Gênero");
        System.out.println("Digite nomes e gêneros separados por vírgula e traço (Ex: Ethan - M): ");
        
        String entrada = scanner.nextLine();
        
        String[] pessoas = entrada.split(",");
        
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();
        
        for (String pessoa : pessoas) {
            String[] dados = pessoa.split("-");
            
            if (dados.length == 2) {
                String nome = dados[0].trim();
                String genero = dados[1].trim().toUpperCase(); 
                
                if (genero.equals("M")) {
                    grupoMasculino.add(nome);
                } else if (genero.equals("F")) {
                    grupoFeminino.add(nome);
                } else {
                    System.out.println("Aviso: Gênero não reconhecido para " + nome);
                }
            }
        }
        
        System.out.println("\nGRUPO MASCULINO");
        for (String m : grupoMasculino) {
            System.out.println(m);
        }
        
        System.out.println("\nGRUPO FEMININO");
        for (String f : grupoFeminino) {
            System.out.println(f);
        }
        
        scanner.close();
    }
}