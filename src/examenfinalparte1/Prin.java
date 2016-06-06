package examenfinalparte1;

import java.io.IOException;

public class Prin {

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
