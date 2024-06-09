public class FuncionarioMensalista extends Funcionario
{
    public FuncionarioMensalista(String nome, int idade, double salarioBase) {
        super(nome, idade, salarioBase);
    }

    @Override
    public double calculaSalario() 
    {
        return this.getSalarioBase();
    }
}
