public class Estagiario extends Funcionario
{
    private String Supervisor;

    public Estagiario(String nome, String cpf, double salario, String supervisor) 
    {
        super(nome, cpf, salario);
        Supervisor = supervisor;
    }

    public String getSupervisor() 
    {
        return Supervisor;
    }

    public void setSupervisor(String supervisor) 
    {
        Supervisor = supervisor;
    }

    @Override
    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Supervisor: " + this.getSupervisor());
        System.out.println();
    } 
}
