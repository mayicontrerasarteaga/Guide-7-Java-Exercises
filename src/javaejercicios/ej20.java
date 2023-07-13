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
public class ej20 {
    
    public static void main(String[] args) {
        
        /**
         * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
         *suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
         * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
         * El programa deberá comprobar que los números introducidos son correctos, es decir,
         * están entre el 1 y el 9.
         */
        
        int[][] matriz = new int[3][3];
        
        matriz = llenarMatriz(matriz);
        
        System.out.println("Su cuadrado mágico ingresado es:");
        
        mostrarMatriz(matriz);
        
        //determinar si el cuadrado es mágico o no
    }
    
    public static int[][] llenarMatriz(int[][] matriz) {
        
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Ingrese los números del cuadrado mágico (entre 1 y 9):");
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {   
                                
                while (true) {
                    num = in.nextInt();
                    in.nextLine();
                    
                    if (num >= 1 && num <= 9) {
                        matriz[i][j] = num;         
                        break;
                        
                    } else {
                        System.out.println("Ingrese un número válido (entre 1 y 9):");
                    }
                }
            }          
        }
        return matriz;
    } 
    
    public static void mostrarMatriz(int[][] matriz) {
        
        for (int i = 0; i < matriz.length ; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print(" [" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}

