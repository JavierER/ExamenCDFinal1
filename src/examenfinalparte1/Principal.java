package examenfinalparte1;

public class Principal {

    int i;

    /**
     * Este constructor recoge 2 variables y las mete dentro de una 3 aplicando el método met(suma) a las 2 primeras.
     * @param j
     * @param m 
     */
    public Principal(int j, int m) {
        i = met(j, m);
    }

    public Principal(int j) {
        i = met(j, j);
    }

    public Principal() {
        i = -1;
    }

    public int met(int x, int x1) {
        return x + x1;
    }
}
