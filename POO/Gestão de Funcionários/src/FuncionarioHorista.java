public class FuncionarioHorista extends Funcionario 
{
    public int HorasTrabalhadas;

    public FuncionarioHorista(String nome, int idade, int horasTrabalhadas) {
        super(nome, idade);
        this.HorasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaSalario() 
    {
        double salarioBase = 20 * (this.HorasTrabalhadas * 10);

        setSalarioBase(HorasTrabalhadas);
        
        return salarioBase;
    }
    
}
