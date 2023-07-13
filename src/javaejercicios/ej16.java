/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author Nezuko
 */
public class ej16 {
    
    public static void main(String[] args) {
        
        /**
        *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        *usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        *numero y si se encuentra repetido
        */
        
              
        System.out.println("Bienvenido!");
        System.out.println("Ingrese qué número desea buscar en la lista:");
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        int[] vector = new int[20];
        
        llenarVector(vector);
                
        mostrarVector(vector);
        
        System.out.println("");
        
        int contador = 0;
        
        for (int i = 0; i < 20; i++) {
                        
            if (vector[i] == num) {
                
                contador++;
                
                if (contador == 1) {
                    System.out.println("El número " + num + " se encuentra en la posición " + (i+1));
                    
                } else {
                    System.out.println("El número " + num + " se encuentra repetido en la posición " + (i+1));
                }
            
            }  
      
        }
        
        if (contador == 0) {
                System.out.println("El número " + num + " no se encuentra en la lista.");
            }
    }
    
    public static void llenarVector(int[] vector) {
        
        for (int i = 0; i < 20; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }
    
    public static void mostrarVector(int[] vector) {
        
        for (int i = 0; i < 20; i++) {
            
            System.out.print(vector[i] + " ");
        }
    }
}
