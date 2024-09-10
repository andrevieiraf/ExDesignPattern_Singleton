package org.example;

public class Fila {

    private static Fila instancia;

    public static Fila getInstancia() {
        if (instancia == null){
            instancia = new Fila();
        }
        return instancia;
    }
}
