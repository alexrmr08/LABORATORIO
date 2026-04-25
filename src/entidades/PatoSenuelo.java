
package entidades;

import dominio.Cuaqueable;
import dominio.Volable;

public class PatoSenuelo extends Pato implements Volable, Cuaqueable {

    @Override
    public void mostrar() {
        System.out.println("Yo soy un PATO SEÑUELO.");
    }

    @Override
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR.");
    }

    @Override
    public void cuaquear() {
        System.out.println("<<Silencio>>");
    }

    @Override
    public void setVolable(Volable fb) {
        System.out.println("");
    }

    @Override
    public void setCuaqueable(Volable fb) {
        System.out.println("");
    }

    @Override
    public void realizarVueo(Volable fb) {
        System.out.println("");
    }

    @Override
    public void realizarCuaqueo(Volable fb) {
        System.out.println("");
    }
    
    
    
}
