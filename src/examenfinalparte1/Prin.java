package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Principal ObjDobleVariable = new Principal(10, 20);
        int n = ObjDobleVariable.i;
        System.out.println("Es: " + n);
        
        Principal ObjVariable = new Principal(10);
        int m = ObjVariable.i;
        System.out.println("Es: " + m);
        
        Principal ObjSinVariable = new Principal();
        int nn = ObjSinVariable.i;
        System.out.println("Es: " + nn);
    }
}
