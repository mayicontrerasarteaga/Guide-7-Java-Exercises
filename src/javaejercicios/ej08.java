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
public class ej08 {
    
    public static void main(String[] args) {
        //Realizar un programa que solo permita introducir frases o palabras de 8 de largo. Si el
        //usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
        //pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        
        String phrase;
        int longitud;
        
        longitud = 8;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase de longitud 8:");
        
        phrase = in.nextLine();
        
        if (phrase.length() == longitud) {
            System.out.println("Correcto! :D");
        
        } else {
            System.out.println("Incorrecto :C");
        }
    }
}
