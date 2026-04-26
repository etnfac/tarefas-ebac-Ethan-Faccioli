import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor Wrapper");
        System.out.print("Digite um valor numérico inteiro: ");
        
        int valorPrimitivo = scanner.nextInt();
        System.out.println("Valor armazenado na variável primitiva (int): " + valorPrimitivo);

        // Fazendo a conversão para o tipo Wrapper
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // 3. Imprimindo novamente
        System.out.println("Valor armazenado na classe Wrapper (Integer): " + valorWrapper);
        
        scanner.close();
    }
}