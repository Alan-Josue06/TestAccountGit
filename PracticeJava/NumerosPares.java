package PracticeJava;
import java.util.*;
public class NumerosPares {

    public static void main(String [] args){

        Scanner read=new Scanner(System.in);

        int numero;
        int []array;

        System.out.println("Ingrese la cantidad de numeros a ingresar: ");
        numero= read.nextInt();
        array=new int[numero];

        System.out.println("Ingrese los numeros: ");
        for(int i=0;i<array.length;i++){
            array[i]= read.nextInt();
        }
        NumeroPar(array);

    }

    public static void NumeroPar(int [] datos){

        int pares=0;
        int impares=0;

        System.out.println("Numeros pares encontrados: ");
        for(int i=0;i<datos.length;i++)
        if(datos[i]%2==0){
            System.out.print(datos[i]+" , ");
            pares++;

        }

        else{
            impares++;
        }
        System.out.println("");

        System.out.println("Hay "+pares+" numeros pares");
    }
}
