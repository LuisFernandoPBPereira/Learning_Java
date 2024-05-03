public abstract class Funcionario 
{
    private String Nome;
    private int Idade;
    private double SalarioBase;
    
    public Funcionario(String nome, int idade) 
    {
        this.Nome = nome;
        this.Idade = idade;
    }

    public Funcionario(String nome, int idade, double salarioBase) 
    {
        this.Nome = nome;
        this.Idade = idade;
        this.SalarioBase = salarioBase;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    
    public abstract double calculaSalario();
}
