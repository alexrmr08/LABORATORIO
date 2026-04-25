/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import dominio.Cuaqueable;
import dominio.Volable;

/**
 *
 * @author sistemas
 */
public class PatoDeGoma extends Pato implements Cuaqueable, Volable{

    @Override
    public void mostrar() {
        System.out.println("Yo soy un patito de goma.");
    }

    @Override
    public void cuaquear() {
        System.out.println("Chirr Chirr");
    }

    @Override
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR.");
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
