import java.util.ArrayList;

public class Pedido 
{
    private Cliente Cliente;
    private ArrayList<ProdutoEletronico> Itens = new ArrayList<ProdutoEletronico>();
    
    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public void adicionarItem(ProdutoEletronico item)
    {
        this.Itens.add(item);
    }

    public double calcularTotal()
    {
        double totalPreco=0;
        
        for (var produto : Itens) {
            totalPreco += produto.getPreco();
        }

        return totalPreco;
    }
}
