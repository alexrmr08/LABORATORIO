
package entidades;

import dominio.Cuaqueable;
import dominio.Volable;

public class PatoSenuelo extends Pato{

    @Override
    public void mostrar() {
        System.out.println("Yo soy un PATO SEÑUELO.");
    }

    @Override
    public void setVolable(Volable fb) {
        System.out.println("");
    }

    @Override
    public void setCuaqueable(Cuaqueable fb) {
        System.out.println("");
    }

    @Override
    public void realizarVueo(Volable fb) {
        System.out.println("");
    }

    @Override
    public void realizarCuaqueo(Cuaqueable fb) {
        System.out.println("");
    }
    
    
    
}
