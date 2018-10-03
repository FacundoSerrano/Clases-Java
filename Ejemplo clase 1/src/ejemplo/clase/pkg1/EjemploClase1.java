/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.clase.pkg1;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class EjemploClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int unNumero;
        String nombre;
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Ingrese un numero: ");
        
        unNumero = lector.nextInt();
       
        System.out.println("El numero es: " + unNumero);
        
        System.out.println("Ingrese su nombre: ");
        nombre = lector.next();
        
        System.out.println("Su nombre es: " + nombre);  
        
        mostrarMensaje("Hola a todos");
        */
        
        int numero = 0;
        int i = 0;
        int menor = 100;
        int mayor = 0;
        float promedio = 0;
        
        Scanner lector = new Scanner (System.in);
        
        
        for(i=0; i<5; i++)
        {
            System.out.println("Ingrese un numero: ");
            numero = lector.nextInt();
            if(numero > mayor)
            {
                mayor = numero;
            }
            if(numero < menor)
            {
                menor = numero;
            }
            promedio = promedio + numero;
        }
        
        promedio = promedio/5;
        
      System.out.println("El mayor es: " + mayor);  
      System.out.println("El menor es: " + menor);
      System.out.println("El promedio es: " + promedio);
    }
    
    /*
    public static void mostrarMensaje(String mensaje)
    {
        System.out.println(mensaje);
    }
    */
}