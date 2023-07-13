/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;
/**
 *
 * @author Nezuko
 */
public class ej15 {
    
    public static void main(String[] args) {
        
        /**
         * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
            muestre por pantalla en orden descendente.
         */
        
        int[] vector = new int[100];
        
        llenarVector(vector);
        mostrarVector(vector);
        
    }
    
    public static void llenarVector(int[] vector) {
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
        }
    }
    
    public static void mostrarVector(int[] vector) {
        
        for (int i = 0; i < 100; i++) {
            System.out.println(vector[99-i]);
        }
    }
}
