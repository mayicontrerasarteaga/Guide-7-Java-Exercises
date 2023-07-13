/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

/**
 *
 * @author Nezuko
 */
public class ej18 {
    
    public static void main(String[] args) {
        /**
         * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
         * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
         * cambiando sus filas por columnas (o viceversa).
         */
        
        int[][] matriz = new int[4][4];
        
        llenarMatriz(matriz);
        
        System.out.println("Matriz A:");
        
        mostrarMatriz(matriz);
        
        System.out.println("Matriz B (traspuesta de Matriz A):");
        
        mostrarMatrizB(matriz);
    }
    
    public static int randomNumber(int min, int max) {
        return (int) (
                (
                        Math.random() * (max - min)
                ) + min
        );
    }
    
    public static void llenarMatriz(int[][] matriz) {
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j] = randomNumber(0, 100);
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                System.out.print(" [" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarMatrizB(int[][] matriz) {
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                System.out.print(" [" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
