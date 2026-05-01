public class LeitorDeAnotacoes {
    
    public static void main(String[] args) {
        System.out.println("Lendo Anotações em Tempo de Execução\n");

        lerNomeDaTabela(Cliente.class);
    }

    /**
     * Para ler uma anotação em tempo de execução no Java, utilizamos a Reflection API. A Reflection permite que o código inspecione a si mesmo. Usando o comando NomeDaClasse.class.isAnnotationPresent(), o programa verifica na memória se a 'etiqueta' foi colocada na classe e, com o getAnnotation(), nós extraímos os valores que foram passados para ela, como o nome da tabela.
     */
    public static void lerNomeDaTabela(Class<?> alvo) {
        
        System.out.println("Analisando a classe: " + alvo.getSimpleName() + "...");
        
        if (alvo.isAnnotationPresent(Tabela.class)) {
            
            Tabela anotacao = alvo.getAnnotation(Tabela.class);
            
            System.out.println("-> SUCESSO: A tabela no banco de dados é [" + anotacao.value() + "]");
            
        } else {
            System.out.println("-> ERRO: Esta classe não possui a anotação @Tabela.");
        }
    }
}

