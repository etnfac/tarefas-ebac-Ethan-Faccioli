public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf; // Específico
        this.dataNascimento = dataNascimento;
    }

    public void exibirCpf() {
        System.out.println("CPF: " + cpf + " (Nascido em: " + dataNascimento + ")");
    }
}