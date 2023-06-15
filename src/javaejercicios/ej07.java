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
public class ej07 {
    
    public static void main(String[] args) {
        //Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        //pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
        
        String phrase;
        String codigo;
        
        codigo = "eureka";
        
        System.out.println("Ingrese el código secreto:");
        
        Scanner in = new Scanner(System.in);
        
        phrase = in.nextLine();
        
        if (phrase.equals(codigo)) {
            System.out.println("Correcto! :D");
            
        } else {
            System.out.println("Incorrecto :C");
        }

    }
}
