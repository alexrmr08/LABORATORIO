
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