package Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;

        

        do {

            System.out.println("--------------MENU------------");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Lista de empleado");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Salir");
            System.out.println("--------------------------------");
            System.out.println("Ingrese una opcion: ");

            op = sc.nextInt();

            switch (op){


                
                case 1:
                    System.out.println("Ingrese la cantidad de empleados: ");
                    int n= sc.nextInt();
                    String Nombre[]=new String[n];

                   for (int i=0; i< Nombre.length;i++){
                       System.out.println("Ingrese el nombre del empleado "+(i+1)+":");
                       Nombre[i]=sc.next();
                   }
                    break;

                case 2:
                    System.out.println("\t============Lista de Empleados==============");

                    System.out.println("================================================");
                    break;

                default:
                    System.out.println("Opcion Invalida");
            }


        } while (op!=4);
    }
}
