/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicios;
import java.util.Scanner;
/**
 *
 * @author Nezuko
 */
public class JavaEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ej 01
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        //dos. El programa deberá después mostrar el resultado de la suma
        
        int num1;
        int num2;
        int result;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros para sumar:");
        
        num1 = in.nextInt();
        num2 = in.nextInt();
        result = num1 + num2;
        
        System.out.println("El resultado de la suma es: " + result);
        
    }
    
}
