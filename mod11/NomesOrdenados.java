import java.util.Arrays;
import java.util.Scanner;

public class NomesOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Organização de Nomes");
        System.out.println("Digite os nomes separados por vírgula: ");
        
        String entrada = scanner.nextLine();
        
        String[] nomes = entrada.split(",");
        
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }
        
        // Ordenando em ordem alfabética
        Arrays.sort(nomes);
        
        System.out.println("\nLista em Ordem Alfabética");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}