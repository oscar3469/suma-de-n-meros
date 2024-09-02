
package analisis;

import java.util.Scanner;


public class Analisis {

    public static void main(String[] args) {
          // Registrar el tiempo inicial
        long tiempoInicial = System.nanoTime();
        //aqui el codigo 
        Scanner teclado=new Scanner (System.in);
        
       int bandera,dato;
       double suma;
       String c;
       bandera=1;
       suma=0.0;
        while(bandera==1){
            System.out.println("introdusca un dato ");
            dato=teclado.nextInt();
           suma=suma + dato;
            System.out.println("desea seguir ingresando datos (S/N)");
            c=teclado.next();
            if (c.equalsIgnoreCase("N")) {
                bandera=0;
            }
        }
        System.out.println("la suma de los datos es: "+suma);
        // aquitermina el codigo de ejecucion
          // Registrar el tiempo final
        long tiempoFinal = System.nanoTime();

        // Calcular el tiempo de ejecución
        long tiempoEjecucion = tiempoFinal - tiempoInicial;

        // Mostrar el tiempo de ejecución en nanosegundos
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoEjecucion);

        // Convertir a milisegundos si es necesario
        double tiempoEjecucionMs = tiempoEjecucion / 1_000_000.0;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoEjecucionMs);
        
    }
    
}
