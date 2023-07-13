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
public class ej13 {
    
    public static void main(String[] args) {
        /**
         * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
         * cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
            ****
            *  *
            *  *
            ****
         */
        
        int lado;
                
        System.out.println("Bienvenido! Vamos a dibujar un cuadrado");
        System.out.println("Ingrese el número de elementos por lado:");
        
        Scanner in = new Scanner(System.in);
        lado = in.nextInt();
        
        for (int i = 0; i < lado; i++) {
            
            for (int j = 0; j < lado; j++) {
                
                if (i == 0 || i == lado-1 || j == 0 || j == lado-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
