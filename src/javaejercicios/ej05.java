/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;
import java.util.Scanner;
/**
 *
 * @author Nezuko
 */
public class ej05 {
    
    public static void main(String[] args) {
        
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        //doble, el triple y la raíz cuadrada de ese número.
        
        int num;
        int doble;
        int triple;
        double raiz;
        
        System.out.println("Ingrese un número entero:");
        
        Scanner in = new Scanner(System.in);
        
        num = in.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        
        System.out.println("El doble del número es: " + doble );
        System.out.println("El triple del número es: " + triple );
        System.out.println("La raíz cuadrada del número es: " + raiz );

    }
}
