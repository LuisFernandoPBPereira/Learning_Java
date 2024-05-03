public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente contaCorrente = new ContaCorrente(123, 100, "Luis");
        
        contaCorrente.exibirSaldo();

        contaCorrente.sacar(100);

        contaCorrente.exibirSaldo();

        contaCorrente.depositar(1000);

        contaCorrente.exibirSaldo();
    }
}
