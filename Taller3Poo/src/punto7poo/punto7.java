
package punto7poo;

import java.util.Scanner;

/**
 *
 * @author Luis Fabian
 */
public class punto7 {
    
public static void main(String[] args) {
        int[] vector = new int [10];
        int mayor,contador=0,numero=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese numeros al vector[Maximo 10 numeros]");
        mayor = vector[0];
        for (int i=0; i<10; i++)
        {
            vector[i]= entrada.nextInt();
            contador = contador+1;
            numero = vector[i];
            
             if (vector[i]>mayor)
             {
                 mayor = vector[i];
             }
        }

        for (int i=0; i<10; i++)
        {
            System.out.print(vector[i]+" ");
        }
         System.out.println("el mayor es: " +mayor);
         System.out.println("se contaron: "+contador+" numeros");
         System.out.println("el numero mas reciente es:"+numero);
       
        
    }
    
}