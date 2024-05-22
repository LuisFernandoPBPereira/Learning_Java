public class Gerente extends Funcionario 
{
    private double Bonus;

    public Gerente(String nome, String cpf, double salario, double bonus) 
    {
        super(nome, cpf, salario);
        Bonus = bonus;
    }

    public double getBonus() 
    {
        return Bonus;
    }

    public void setBonus(double bonus) 
    {
        Bonus = bonus;
    }
    
    @Override
    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Bônus: " + this.getBonus());
        System.out.println();
    }    
}
