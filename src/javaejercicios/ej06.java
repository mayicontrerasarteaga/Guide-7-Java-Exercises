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
public class ej06 {
    
    public static void main(String[] args) {
        
        //Crear un programa que dado un numero determine si es par o impar
        
        int num;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        
        num = in.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
            
        } else {
            System.out.println("El número " + num + " no es par.");
        }
    }
}
