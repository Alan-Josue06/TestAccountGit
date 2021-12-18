package ProI;

public class MetEmploye {

    public static void WageMaximo(float[] wage){

        for(int i=0;i< wage.length;i++){
            float max,min;
            max=min=wage[0];

            for (float l:wage) {
                if (l > max) {
                    max = l;
                }
                if (l < min) {
                    min = l;
                }
            }
            System.out.printf("El salario mayor es: "+max);
            }

        }


}



