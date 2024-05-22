import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Desenvolvedor> devs = new ArrayList<Desenvolvedor>()
        {{
            add(new Desenvolvedor("Dev1", "00000000000", 1500, "C#"));
            add(new Desenvolvedor("Dev2", "00000000000", 1600, "C#"));
            add(new Desenvolvedor("Dev3", "00000000000", 1700, "C#"));
            add(new Desenvolvedor("Dev4", "00000000000", 1800, "C#"));
        }};
        ArrayList<Gerente> gerentes = new ArrayList<Gerente>()
        {{
            add(new Gerente("Gerente1", "00000000000", 2500, 100));
            add(new Gerente("Gerente2", "00000000000", 2600, 50));
            add(new Gerente("Gerente3", "00000000000", 2700, 30));
            add(new Gerente("Gerente4", "00000000000", 2800, 200));
        }};
        ArrayList<Estagiario> estagiarios = new ArrayList<Estagiario>()
        {{
            add(new Estagiario("Estagiário1", "00000000000", 2500, "Gerente1"));
            add(new Estagiario("Estagiário2", "00000000000", 2600, "Gerente2"));
            add(new Estagiario("Estagiário3", "00000000000", 2700, "Gerente3"));
            add(new Estagiario("Estagiário4", "00000000000", 2800, "Gerente4"));
        }};

        
        for (var item : devs) 
        {
            item.exibirDetalhes();
        }

        for (var item : gerentes) 
        {
            item.exibirDetalhes();
        }

        for (var item : estagiarios) 
        {
            item.exibirDetalhes();
        }
    }
}
