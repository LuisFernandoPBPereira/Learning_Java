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

    public void listarPedido()
    {
        System.out.println("\nCliente: " + this.getCliente().getNome());
        
        for (var produto : Itens) 
        {
            System.out.println("Produto:");
            System.out.println("Marca: " + produto.getMarca());    
            System.out.println("Nome: " + produto.getNome());    
            System.out.println("Preço: " + produto.getPreco());    
            System.out.println();
        }
        System.out.println();
    }
}
