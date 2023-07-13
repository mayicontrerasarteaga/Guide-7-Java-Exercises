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
public class ej10 {
    
    public static void main(String[] args) {
        
        //Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        //números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        int lim;
        int suma;
        int num;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite positivo:");
        lim = in.nextInt();
        suma = 0;
        
        System.out.println("Ingrese números para sumar:");
        while (suma <= lim) {
            num = in.nextInt();
            suma = suma + num;
        }
        
        System.out.println("Superó el límite inicial, la suma de los números ingresados es: " + suma);

    }
}
