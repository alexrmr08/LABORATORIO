package entidades;

public class PatoSenuelo extends Pato {

    public PatoSenuelo() {
        volable = new NoVuela();           // no vuela
        cuaqueable = new CuaqueoMudo();  // no hace sonido
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un PATO SEÑUELO.");
    }
}
