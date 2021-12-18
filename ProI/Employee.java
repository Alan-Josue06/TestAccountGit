package ProI;

import java.util.Scanner;

public class Employee {

    public static void main(String [] args ){

        MetEmploye e =new MetEmploye();

        Scanner lector=new Scanner(System.in);

        String []id=new String[2];
        String[] name=new String[2];
        float [] wage=new float[2];

        for(int i=0;i< name.length;i++){
            System.out.println("Id "+(i+1)+": ");
            id[i]=lector.next();
            System.out.println("Name:  "+(i+1)+": ");
            name[i]=lector.next();
            System.out.println("Wage "+(i+1)+": ");
            wage[i]=lector.nextFloat();
        }
        e.WageMaximo(wage);

    }
}
