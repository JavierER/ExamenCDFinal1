package examenfinalparte1;

public class Principal {

    int solucion;

    /**
     * Este constructor recoge 2 variables y las mete dentro de una 3 aplicando el método met(suma) a las 2 primeras.
     * @param dato1 numero a sumar de la operacion
     * @param dato2 numero a sumar de la operacion
     */
    public Principal(int dato1, int dato2) {
        solucion = operacion(dato1, dato2);
    }

    /**
     * Este segundo constructor recoge 1 variable y la mete dentro de una 2 aplicandole el método met(suma) a la 1, pero 2 veces.
     * @param dobleDato numero a sumar 2 veces
     */
    public Principal(int dobleDato) {
        solucion = operacion(dobleDato, dobleDato);
    }

    /**
     * Este tercer constructor solo inicializa una variable i con valor fijo de -1.
     */
    public Principal() {
        solucion = -1;
    }

    /**
     * A este método se le dan 2 variable x e x1.
     * @param x primer numero de la suma
     * @param x1 segundo numero de la suma
     * @return devuelve la suma de ambas variables.
     */
    public int operacion(int x, int x1) {
        return x + x1;
    }
}
