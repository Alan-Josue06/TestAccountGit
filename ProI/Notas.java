package ProI;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int notas[] = new int[6];
        String name[]=new String[1];
        String []carnet=new String[1];
        float [] prom=new float[1];

        for(int i=0; i< name.length;i++) {
            System.out.println("Escriba el nombre: ");
            name[i]=sc.next();
        }


        for (int k = 0; k < carnet.length; k++) {

            do {

                System.out.println("Escriba el carnet: ");
                carnet[k] = sc.next();


                if (carnet[k].length() > 10) {
                    System.out.println("Error, el carnet sobrepaasa el limite de caracteres");
                }

            } while (carnet[k].length() > 10);
        }


        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                notas[i] = sc.nextInt();
                if (notas[i] < 60 || notas[i] > 100) {
                    System.out.println("La nota ingresada esta fuera del rango");
                }
            } while (notas[i] < 60 || notas[i] > 100);

        }
        System.out.println("");
        System.out.println("\tCalificaciones");
        for(int l=0;l< notas.length;l++){
            System.out.println(notas[l]);

        }
        //System.out.println("");
       // System.out.format("%-12s%-12s%-12s","Nombre","Carnet","Promedio");

        for (int j = 0; j < notas.length; j++) {
            int suma=0;
            suma=+notas[j];
            System.out.println(suma);
        }


    }
}

