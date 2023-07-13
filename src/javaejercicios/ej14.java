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
public class ej14 {
    
    public static void main(String[] args) {
    
        /**
        Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        */
        
        System.out.println("Bienvenido al conversor de divisas!"
                + "\nIngrese la cantidad de euros:");
        
        Scanner in = new Scanner(System.in);
        
        double euro = in.nextDouble();
        in.nextLine();
        
        System.out.println("Ingrese la moneda a la que desea convertir:"
                + "\nlibra"
                + "\ndolar"
                + "\nyen");
        
        String moneda = in.nextLine();
        
        conversionDivisas(euro, moneda);
    }
    
    public static void conversionDivisas (double euro, String moneda) {
        
        switch(moneda) {
                case "libra":
                    double libra = euro * 0.86;
                    System.out.println(euro + " € equivale a " + libra + " libras");
                    break;
                case "dolar":
                    double dolar = euro * 1.28611;
                    System.out.println(euro + " € equivale a " + dolar + " dólares");
                    break;
                case "yen":
                    double yen = euro * 129.852;
                    System.out.println(euro + " € equivale a " + yen + " yenes");
                    break;
                default:
                    break;
    }

    }

}
