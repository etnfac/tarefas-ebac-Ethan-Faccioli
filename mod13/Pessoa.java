public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public void exibirDadosBasicos() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}