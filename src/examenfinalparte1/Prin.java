package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Principal ObjDobleVariable = new Principal(10, 20);
        int n = ObjDobleVariable.i;
        System.out.println("Es: " + n);
        
        Principal nm = new Principal(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        
        Principal mn = new Principal();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }
}
