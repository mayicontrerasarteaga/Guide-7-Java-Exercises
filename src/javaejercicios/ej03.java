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
public class ej03 {
    
    public static void main(String[] args) {
        
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        //en minúsculas.
        
        String phrase;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        
        phrase = in.nextLine();
        
        System.out.println("En mayúscula: " + phrase.toUpperCase());
        System.out.println("En minúscula: " + phrase.toLowerCase());
    }
}
