public class CalculoMedia {
    public static void main(String[] args) {
        
        // 1. Leitura das quatro notas
        double nota1 = 8.5;
        double nota2 = 7.5;
        double nota3 = 9.0;
        double nota4 = 6.0;

        // 2. Realizando o cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // 3. Resultados (console)
        System.out.println("Resultado do Aluno");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("----------------------------");
        System.out.println("A Média Final é: " + media);
    }
}