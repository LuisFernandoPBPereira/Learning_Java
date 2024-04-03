public class App {
    public static void main(String[] args) throws Exception {

        Relogio relogio = new Relogio(8, 0);
        
        relogio.mostraHora();

        relogio.setHoras(10, 70);
        
        relogio.mostraHora();
        relogio.incrementaMinuto();
        relogio.mostraHora();
    }
}
