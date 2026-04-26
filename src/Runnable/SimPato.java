package Runnable;

import entidades.PatoCabezaRoja;
import entidades.PatoDeGoma;
import entidades.PatoReal;
import entidades.PatoSenuelo;

public class SimPato {

    public static void main(String[] args) {

        PatoReal p1 = new PatoReal();
        p1.mostrar();
        p1.realizarCuaqueo();
        p1.realizarVuelo();
        p1.nadar();

        System.out.println("-----");

        PatoDeGoma p2 = new PatoDeGoma();
        p2.mostrar();
        p2.realizarCuaqueo();
        p2.realizarVuelo();
        p2.nadar();

        System.out.println("-----");

        PatoSenuelo p3 = new PatoSenuelo();
        p3.mostrar();
        p3.realizarCuaqueo();
        p3.realizarVuelo();
        p3.nadar();

        System.out.println("-----");

        PatoCabezaRoja p4 = new PatoCabezaRoja();
        p4.mostrar();
        p4.realizarCuaqueo();
        p4.realizarVuelo();
        p4.nadar();
    }
}
