public abstract class Conta 
{
    private int NumeroConta;
    private double Saldo;
    private String Titular;

    public Conta() {}

    public Conta(int numeroConta, double saldo, String titular) 
    {
        this.NumeroConta = numeroConta;
        this.Saldo = saldo;
        this.Titular = titular;
    }

    public void setNumeroConta(int numeroConta)
    {
        this.NumeroConta = numeroConta;
    }

    public int getNumeroConta()
    {
        return this.NumeroConta;
    }

    public void setSaldo(double saldo)
    {
        this.Saldo = saldo;
    }

    public double getSaldo()
    {
        return this.Saldo;
    }

    public void setTitular(String titular)
    {
        this.Titular = titular;
    }

    public String getTitular()
    {
        return this.Titular;
    }

    public void sacar(double saque)
    {
        if(saque > this.Saldo){
            System.out.println("Saldo indisponível");
            return;
        }
        this.Saldo -= saque;
    }

    public void depositar(double deposito)
    {
        if(deposito < 0){
            System.out.println("O depósito precisa ser um valor positivo");
            return;
        }
        this.Saldo += deposito;
    }

    public void exibirSaldo()
    {
        System.out.println("Saldo: " + this.Saldo);
    }
}
