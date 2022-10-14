
package lab1_marcelatovar;

import java.util.Scanner;/**
 *
 * @author ONAN
 */
public class Lab1_MarcelaTovar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("--Bienvenido al sistema de calculo de promedio--");
        System.out.print("Ingrese su nombre: "); //Se ingresa el nombre del usuario
        String nombre  = entrada.nextLine();
        
        // Se ingresa las notas de las cuatro clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        // Se calcula el promedio
    
        double sumaClase=primeraClase+segundaClase+terceraClase+cuartaClase;
        double promedio= sumaClase/4;
        
        // Se imprime el calculo del promedio
        
        System.out.println("---" +nombre +" el promedio de las cuatro clases es: " +promedio + "---");
        
    }
    
}
