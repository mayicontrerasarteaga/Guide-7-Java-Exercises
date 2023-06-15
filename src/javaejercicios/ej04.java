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
public class ej04 {
    
    public static void main(String[] args) {
        
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        //Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        float gradosCentigrados;
        float gradosFarenheit;
        
        System.out.println("Ingrese los grados Centígrados para convertir a grados Farenheit");
        
        Scanner in = new Scanner(System.in);
        
        gradosCentigrados = in.nextFloat();
        
        gradosFarenheit = 32 + (9 * gradosCentigrados / 5);
        
        System.out.println(gradosCentigrados + " grados Centígrados equivale a " + gradosFarenheit 
        + " grados Farenheit.");
        
    }
}
