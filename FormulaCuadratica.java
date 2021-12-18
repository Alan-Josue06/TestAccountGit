import java.util.*;
import java.math.*;

import static java.lang.Math.sqrt;

public class FormulaCuadratica {

    public static void main(String [] args){

    Scanner lector=new Scanner(System.in);

    double a,b,c;
    double Xuno,Xdos;

        System.out.println("Ingrese el valor a: ");
        a=lector.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b=lector.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c=lector.nextDouble();

        Xuno=(-b+sqrt(b*b-4*a*c))/(2*a);
        Xdos=(-b-sqrt(b*b-4*a*c))/(2*a);

        System.out.println("\tLas soluciones son: ");
        System.out.printf("X1= "+Xuno);
        System.out.println("");
        System.out.printf("X2= "+Xdos);


    }
}