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
public class ej02 {
    
    public static void main(String[] args) {
        
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        //pantalla.
        
        String name;
        
        System.out.println("Ingrese su nombre:");
        
        Scanner in = new Scanner(System.in);
        
        name = in.nextLine();
        
        System.out.println("Su nombre es: " + name);
    }
}
