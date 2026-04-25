
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setCuaqueable(Volable fb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void realizarVueo(Volable fb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void realizarCuaqueo(Volable fb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
