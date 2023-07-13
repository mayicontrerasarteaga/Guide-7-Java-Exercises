/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

/**
 *
 * @author Nezuko
 */
public class ej19 {
    
    public static void main(String[] args) {
        
        /**
         * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
         * matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
         * Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
         *  por AT y se obtiene cambiando sus filas por columnas (o viceversa)
        */
        
        int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        
        System.out.println("Matriz A");
        mostrarMatriz(matriz);
                  
        int[][] matrizAT = llenarMatrizTraspuesta(matriz);
        
        System.out.println("Matriz Traspuesta AT");
        mostrarMatriz(matrizAT);
        
        boolean esAntisimetrica = esAntisimetrica(matriz, matrizAT);
        
        if (esAntisimetrica == true) {
            System.out.println("La matriz A es antisimétrica");
        } else  {
            System.out.println("La matriz A no es antisimétrica");
        }
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        
        for (int i = 0; i < matriz.length ; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print(" [" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static int[][] llenarMatrizTraspuesta(int[][] matriz) {
        
        int[][] matrizAT = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                matrizAT[i][j] = matriz[j][i];
            }
        }
        
        return matrizAT;
    }
    
    public static boolean esAntisimetrica(int[][] matriz, int[][] matrizAT) {
        
        boolean esAntisimetrica = false;
        int contador = 0;
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j] == -matrizAT[i][j]) {
                    contador = contador + 1;
                }
                
            }
        }
        
        if (contador == 9) {
            esAntisimetrica = true;
        }
        
        return esAntisimetrica;
    }
}
