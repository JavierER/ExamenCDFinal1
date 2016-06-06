package examenfinalparte1;

import java.io.IOException;

public class Prin {

    /**
     * Clase Main que crea 3 objetos de la calase "Principal" ejecutando en cada uno su respectivo constructor.
     * Muestra por consola el resultado de las sumas creadas con los contrsuctores y el metodo met de la clase "Principal".
     * Se dan los valores a las variables j y m para cada constructor
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        Principal ObjDobleVariable = new Principal(10, 20);
        int resultado1 = ObjDobleVariable.i;
        System.out.println("Es: " + resultado1);
        
        Principal ObjVariable = new Principal(10);
        int resultado2 = ObjVariable.i;
        System.out.println("Es: " + resultado2);
        
        Principal ObjSinVariable = new Principal();
        int resultado3 = ObjSinVariable.i;
        System.out.println("Es: " + resultado3);
    }
}
