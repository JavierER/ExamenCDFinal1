package examenfinalparte1;

import java.io.IOException;

public class Prin {

    /**
     * Este programa suma los valores dados en los constructores y muestra por pantalla el resultado
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        Principal ObjDobleVariable = new Principal(10, 20);
        int resultado1 = ObjDobleVariable.solucion; //=30 (10+20)
        System.out.println("Es: " + resultado1);
        
        Principal ObjVariable = new Principal(10);
        int resultado2 = ObjVariable.solucion; //=20 (dos veces 10)
        System.out.println("Es: " + resultado2);
        
        Principal ObjSinVariable = new Principal();
        int resultado3 = ObjSinVariable.solucion; //=-1
        System.out.println("Es: " + resultado3);
    }
}
