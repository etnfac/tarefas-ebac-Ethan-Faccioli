import java.util.Scanner;

public class CalculoMediaCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Notas");
        
        // 1. Lendo as notas do console
        System.out.print("Digite a 1ª nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a 2ª nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a 3ª nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Digite a 4ª nota: ");
        double nota4 = scanner.nextDouble();

        // 2. Calculando a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média Final: " + media);

        // 3. Estrutura de Condição
        if (media >= 7.0) {
            System.out.println("Status: ALUNO APROVADO!");
        } else if (media >= 5.0) {
            System.out.println("Status: ALUNO DE RECUPERAÇÃO!");
        } else {
            System.out.println("Status: ALUNO REPROVADO!");
        }

        scanner.close();
    }
}