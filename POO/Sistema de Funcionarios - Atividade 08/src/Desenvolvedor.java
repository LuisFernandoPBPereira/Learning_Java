public class Desenvolvedor extends Funcionario
{
    private String LinguagemPrincipal;
    
    public Desenvolvedor(String nome, String cpf, double salario, String linguagemPrincipal) 
    {
        super(nome, cpf, salario);
        LinguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() 
    {
        return LinguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) 
    {
        LinguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public void exibirDetalhes() 
    {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Linguagem principal: " + this.getLinguagemPrincipal());
        System.out.println();
    }
}
