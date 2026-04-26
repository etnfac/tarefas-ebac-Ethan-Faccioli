public class ProgramaPrincipal {
    public static void main(String[] args) {
        System.out.println("DADOS DA PESSOA FÍSICA");
        PessoaFisica pf = new PessoaFisica("Ethan", "Jundiai/SP", "0000-0002", "123.456.789-00", "22/07/2002");
        
        pf.exibirDadosBasicos();
        pf.exibirCpf();


        System.out.println("\nDADOS DA PESSOA JURÍDICA");
        PessoaJuridica pj = new PessoaJuridica("M31 Visuals", "Papanduva/SC", "0000-0000", "00.000.000/0001-00", "M31 Visuals");
        
        pj.exibirDadosBasicos();
        pj.exibirCnpj();
    }
}