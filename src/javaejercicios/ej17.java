/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;


/**
 *
 * @author Nezuko
 */
public class ej17 {
    
    public static int randomNumber(int min, int max) {
        return (int) (
                (
                        Math.random() * (max - min)
                ) + min
        );
    }

    public static int numberCifras(int number) {
        if (number < 10) {
            return 1;
        }
        return numberCifras((int) number / 10) + 1;
    }
    
    public static void main(String[] args) {
        
        /**
         * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
         * de 2 dígitos, etcétera (hasta 5 dígitos).
         */
        
         int[] vector = new int[100000];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = randomNumber(1, 19999);
        }

        int[] contadores = new int[5];

        for (int j : vector) {
            //int numerosCifras = numberCifras(j);
            int numerosCifras = String.valueOf(j).length();
            contadores[numerosCifras - 1] += 1;
        }

        for (int i = 0; i < contadores.length; i++) {
            System.out.println("Cantidad con " + (i + 1) + " cifras son: " + contadores[i]);
        }
    }
}
