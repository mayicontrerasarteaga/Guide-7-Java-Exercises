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
public class ej09 {
    
    public static void main(String[] args) {
        
        //Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
        //es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
        //diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        
        String phrase;
        String letter;
        
        letter = "A";
        
        System.out.println("Ingrese una frase o palabra que comience con 'A': ");
        
        Scanner in = new Scanner(System.in);
        
        phrase = in.nextLine();
        
        if (phrase.substring(0, 1).equals(letter)) {
            System.out.println("Correcto! :D");
            
        } else {
            System.out.println("Incorrecto :C");
        }
    }
}
