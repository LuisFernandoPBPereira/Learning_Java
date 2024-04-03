public class Relogio {
    private int Horas;
    private int Minutos;

    public Relogio(int horas, int minutos) {
        Horas = horas;
        Minutos = minutos;
    }

    public int getHoras() {
        return Horas;
    }
    public void setHoras(int horas, int minutos) {
        Horas = horas;
        Minutos = minutos;
        while(getMinutos() > 59){
            Horas += 1;
            Minutos -= 60;
        }
    }
    public int getMinutos() {
        return Minutos;
    }

    public void incrementaMinuto(){
        this.Minutos +=1;
        if(getMinutos() == 60){
            this.Horas +=1;
            this.Minutos = 0;
        }
    }

    public void mostraHora(){
        if(getMinutos() < 10)
            System.out.println(getHoras() + ":0" + getMinutos());
        else
            System.out.println(getHoras() + ":" + getMinutos());
    }
}
