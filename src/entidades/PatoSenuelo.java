
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
    
    
    
}
