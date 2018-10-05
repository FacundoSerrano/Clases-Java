/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author capacita_mecon
 */
public class Calculadora {
    
    private static float Resultado;
    private static char Operador;
    
    public static void Sumar(int num1, int num2)
    {
        Resultado = num1 + num2;
   
    }
    
    public static void Restar(int num1, int num2)
    {
        Resultado = num1 - num2;
    }
    
    public static void Multiplicar(int num1, int num2)
    {
        Resultado = num1 * num2;
    }
    
    public static void Dividir(int num1, int num2)
    {
        if(num2 != 0)
        {
            Resultado = (float)num1 / num2;
        }
    }
    
    public static void MostrarResultado()
    {
        System.out.println("El resultado es: " + Resultado);
    }
    
    public static void CalcularOperacion(int num1, int num2)
    {
        switch(Operador)
        {
            case '+':
                Sumar(num1,num2);
                break;
            case '-':
                Restar(num1,num2);
                break;
            case '*':
                Multiplicar(num1,num2);
                break;
            case '/':
                Dividir(num1,num2);
                break;
        }
    }
    public static char getOperador()
    {
        return Operador;
    }
    public static void setOperador(char operando)
    {
       Operador = operando;
    }
}

