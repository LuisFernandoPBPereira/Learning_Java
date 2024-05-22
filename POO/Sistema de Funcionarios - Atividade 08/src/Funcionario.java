public abstract class Funcionario 
{
    private String Nome;
    private String Cpf;
    private double Salario;
    
    
    public Funcionario(String nome, String cpf, double salario) 
    {
        Nome = nome;
        Cpf = cpf;
        Salario = salario;
    }


    public String getNome() 
    {
        return Nome;
    }
    public void setNome(String nome) 
    {
        Nome = nome;
    }
    public String getCpf() 
    {
        return Cpf;
    }
    public void setCpf(String cpf) 
    {
        Cpf = cpf;
    }
    public double getSalario() 
    {
        return Salario;
    }
    public void setSalario(double salario) 
    {
        Salario = salario;
    }

    public abstract void exibirDetalhes();
}
