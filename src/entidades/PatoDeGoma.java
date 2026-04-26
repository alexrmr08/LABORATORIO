package entidades;

public class PatoDeGoma extends Pato {

    public PatoDeGoma() {
        volable = new NoVuela();       // no vuela
        cuaqueable = new Chirreo();   // hace chirrido
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un Patito de Goma.");
    }
}