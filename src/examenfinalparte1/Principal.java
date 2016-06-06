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

    /**
     * Este segundo constructor recoge 1 variable y la mete dentro de una 2 aplicandole el método met(suma) a la 1, pero 2 veces.
     * @param j 
     */
    public Principal(int j) {
        i = met(j, j);
    }

    /**
     * Este tercer constructor solo inicializa una variable i con valor fijo de -1.
     */
    public Principal() {
        i = -1;
    }

    /**
     * A este método se le dan 2 variable x e x1.
     * @param x
     * @param x1
     * @return devuelve la suma de ambas variables.
     */
    public int met(int x, int x1) {
        return x + x1;
    }
}
