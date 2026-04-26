package entidades;

import dominio.Volable;
import dominio.Cuaqueable;

public abstract class Pato {

    protected Volable volable;
    protected Cuaqueable cuaqueable;

    public Pato() {
    }

    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN.\n");
    }

    public abstract void mostrar();

    public void setVolable(Volable fb) {
        this.volable = fb;
    }

    public void setCuaqueable(Cuaqueable fb) {
        this.cuaqueable = fb;
    }

    public void realizarVuelo() {
        volable.volar();
    }

    public void realizarCuaqueo() {
        cuaqueable.cuaquear();
    }
}