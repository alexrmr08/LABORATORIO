
package Runnable;

import entidades.PatoCabezaRoja;
import entidades.PatoDeGoma;
import entidades.PatoReal;
import entidades.PatoSenuelo;


public class Ejecutable {

    
    public static void main(String[] args) {
        
        PatoReal p1 = new PatoReal();
        p1.mostrar();
        p1.cuaquear();
        p1.volar();
        p1.nadar();
       
        PatoDeGoma p2 = new PatoDeGoma();
        p2.mostrar();
        p2.cuaquear();
        p2.volar();
        p2.nadar();
        
        PatoSenuelo p3 = new PatoSenuelo();
        p3.mostrar();
        p3.cuaquear();
        p3.volar();
        p3.nadar();
        
        PatoCabezaRoja p4 = new PatoCabezaRoja();
        p4.mostrar();
        p4.cuaquear();
        p4.volar();
        p4.nadar();
        
    }
    
}
