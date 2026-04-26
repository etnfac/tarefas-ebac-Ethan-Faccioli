public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nomeFantasia, String endereco, String telefone, String cnpj, String razaoSocial) {
        this.nome = nomeFantasia;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public void exibirCnpj() {
        System.out.println("CNPJ: " + cnpj + " | Razão Social: " + razaoSocial);
    }
}