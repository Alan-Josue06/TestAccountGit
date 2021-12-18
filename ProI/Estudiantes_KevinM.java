package ProI;

import java.util.Scanner;

public class Estudiantes_KevinM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos estudiantes desea ingresar?: ");
        int cantidad = sc.nextInt();


        String[] estudiantes = new String[cantidad];
        String[] notas = new String[cantidad];
        float[] AcuIp = new float[cantidad];
        float[] AcuIIp = new float[cantidad];
        float[] ExIp = new float[cantidad];
        float[] exIIp = new float[cantidad];
        float[] NotaFi = new float[cantidad];
        float[] Notaprom = new float[cantidad];
        float[] Notamax = new float[cantidad];
        float[] Notamin = new float[cantidad];
        String[] ReproAprobado = new String[cantidad];
        int opcion;


        for (int i = 0; i < cantidad; i++) {

            System.out.printf("Ingrese el nombre del estudiante%2d: ", (i + 1));
            estudiantes[i] = sc.next();

            do {
                System.out.print("AcumIP de " + estudiantes[i] + " : ");
                AcuIp[i] = sc.nextInt();
                if (AcuIp[i] < 0 || AcuIp[i] > 15) {
                    System.out.printf("\nNota incorrecta,vuelva ingresar la nota\n");
                }
            } while (AcuIp[i] < 0 || AcuIp[i] > 15);

            do {
                System.out.print("ExIP de " + estudiantes[i] + " : ");
                ExIp[i] = sc.nextInt();
                if (ExIp[i] < 0 || ExIp[i] > 35) {
                    System.out.printf("\nNota incorrecta,vuelva ingresar la nota\n");
                }
            } while (ExIp[i] < 0 || ExIp[i] > 35);

            do {
                System.out.print("AcumIIP de " + estudiantes[i] + " : ");
                AcuIIp[i] = sc.nextInt();
                if (AcuIIp[i] < 0 || AcuIIp[i] > 15) {
                    System.out.printf("\nNota incorrecta,vuelva ingresar la nota\n");
                }
            } while (AcuIIp[i] < 0 || AcuIIp[i] > 15);

            do {
                System.out.print("ExIIP de " + estudiantes[i] + " : ");
                exIIp[i] = sc.nextInt();
                if (exIIp[i] < 0 || exIIp[i] > 35) {
                    System.out.printf("\nNota incorrecta,vuelva ingresar la nota\n");
                }
            } while (exIIp[i] <= 0 || exIIp[i] > 35);


            NotaFi[i] = AcuIp[i] + ExIp[i] + AcuIIp[i] + exIIp[i];
            Notaprom[i] = NotaFi[i] / 4;
        }

        do {

            System.out.println("\n------------MENU ACADEMICO------------");
            System.out.println("1. Notas Digitadas");
            System.out.println("2. Listado de los nombres con su respectiva calificacion");
            System.out.println("3. Listado estadistico");
            System.out.println("4. Salir");
            System.out.println("------------------------------------------");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1: {
                    for (int i = 0; i < cantidad; i++) {

                        System.out.println();
                        System.out.format("%-12s%-12s%-12s%-12s%-12s%-12s", "Nombre", "AcumIP", "ExIP", "AcumIIP", "ExIIP", "NF\t");
                        for (i = 0; i < cantidad; i++) {

                            System.out.println();
                            System.out.format("%-12s%-12.2f%-12.2f%-12.2f%-12.2f%-12.2f", estudiantes[i], AcuIp[i], ExIp[i], AcuIIp[i], exIIp[i], NotaFi[i]);
                        }

                    }
                    break;
                }

                case 2: {
                    for (int j = 0; j < cantidad; j++) {

                        if (NotaFi[j] < 60) {
                            notas[j] = "Suspenso";
                        } else if (NotaFi[j] < 70) {
                            notas[j] = "Bien";
                        } else if (NotaFi[j] < 90) {
                            notas[j] = "Notable";
                        } else if (NotaFi[j] < 101) {
                            notas[j] = "Sobresaliente";
                        }
                    }
                    System.out.println();
                    System.out.format("%-20s%-20s%-20s", "Nombre", "Nota Final", "Calificación");
                    System.out.printf("\n-----------------------------------------------------------------\n");
                    for (int i = 0; i < cantidad; i++) {
                        System.out.format("%-20s%-20.2f%-20s\n", estudiantes[i], NotaFi[i], notas[i]);
                    }
                    break;
                }
                case 3:


                    for (int i = 0; i < estudiantes.length; i++) {
                        if (i < estudiantes.length) {
                            if (Notamax[i] < NotaFi[i]) {
                                Notamax[i] = NotaFi[i];
                            }

                            if (Notamin[i] > NotaFi[i]) {
                                Notamin[i] = NotaFi[i];
                            }

                            if (NotaFi[i] < 60) {
                                ReproAprobado[i] = "Reprobado";
                            } else {
                                ReproAprobado[i] = "Aprobado";
                            }
                        }
                    }
                    System.out.println();
                    System.out.format("%-20s%-20s%-20s%-20s%-20s", "Nombre", "Promedio", "Nota Mayor", "Nota Menor", "Aprobado/Reprobado");
                    System.out.printf("\n------------------------------------------------------------------------------------------------------\n");
                    for (int i = 0; i < cantidad; i++) {
                        System.out.format("%-20s%-20.2f%-20.2f%-20.2f%-20s\n", estudiantes[i], Notaprom[i], Notamax[i], Notamin[i], ReproAprobado[i]);
                    }
                case 4:
                    System.out.println("Gracias por utilizar el menu");
                    break;
            }

            continue;


        } while (opcion!=4);
    }
}


