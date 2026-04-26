import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AgrupamentoPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> grupos = new HashMap<>();
        
        grupos.put("Masculino", new ArrayList<>());
        grupos.put("Feminino", new ArrayList<>());

        System.out.println("Agrupamento por Gênero");
        System.out.println("Instruções: Digite 'sair' no nome para encerrar.");

        while (true) {
            System.out.print("\nDigite o nome: ");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexoInput = scanner.nextLine().trim().toUpperCase();

            if (sexoInput.equals("M")) {
                grupos.get("Masculino").add(nome);
                System.out.println(nome + " adicionado ao grupo Masculino.");
            } else if (sexoInput.equals("F")) {
                grupos.get("Feminino").add(nome);
                System.out.println(nome + " adicionado ao grupo Feminino.");
            } else {
                System.out.println("Gênero inválido! Use M para Masculino ou F para Feminino.");
            }
        }

        System.out.println("\nRESULTADO FINAL");
        grupos.forEach((genero, listaNomes) -> {
            System.out.println("Grupo " + genero + ": " + listaNomes);
        });

        scanner.close();
    }
}