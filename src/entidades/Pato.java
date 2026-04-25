/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import dominio.Volable;

/**
 *
 * @author sistemas
 */
public abstract class Pato {
    
    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN.\n");
    }
    
    public abstract void mostrar();
    public abstract void setVolable(Volable fb);
    public abstract void setCuaqueable(Volable fb);
    public abstract void realizarVueo(Volable fb);
    public abstract void realizarCuaqueo (Volable fb);
    
    
}
