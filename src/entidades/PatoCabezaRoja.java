
package entidades;

import dominio.Cuaqueable;
import dominio.Volable;

public class PatoCabezaRoja extends Pato implements Volable, Cuaqueable{

    @Override
    public void mostrar() {
        System.out.println("Yo soy un real PATO CABEZA ROJA");
    }

    @Override
    public void cuaquear() {
        System.out.println("Soy un verdadero pato por eso hago CUAC CUAC");
    }

    @Override
    public void volar() {
        System.out.println("Puedo volar con mis alas.");
    }
    
    
    
}
