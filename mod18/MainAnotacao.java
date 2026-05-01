public class MainAnotacao {
    public static void main(String[] args) {
        
        System.out.println("Leitor de Anotações");

        Class<Cliente> classe = Cliente.class;

        if (classe.isAnnotationPresent(Tabela.class)) {
            
            Tabela anotacaoTabela = classe.getAnnotation(Tabela.class);
            
            String nomeDaTabela = anotacaoTabela.value();
            
            System.out.println("A classe '" + classe.getSimpleName() + "' está mapeada para a tabela de banco de dados: " + nomeDaTabela);
        } else {
            System.out.println("A classe não possui a anotação @Tabela.");
        }
    }
}