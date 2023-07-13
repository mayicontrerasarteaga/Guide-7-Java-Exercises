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
public class ej11 {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int opcion;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros positivos para operar:");
        
        num1 = in.nextInt();
        in.nextLine();
        num2 = in.nextInt();
        in.nextLine();
                
        do {
            mostrarMenu();
            opcion = in.nextInt();
            in.nextLine();

            switch(opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("El resultado de la suma es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resta);
                    break;
                case 3:
                    int multiplicar = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + multiplicar);
                    break;
                case 4:
                    int dividir = num1 / num2;
                    System.out.println("El resultado de la división es: " + dividir);
                    break;
                default:
                    break;
            }
            if (opcion == 5) {
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String salir = in.nextLine();
                System.out.println(salir);
                if (salir.equals("N")) {
                    continue;
                } else if ("S".equals(salir)) {
                    System.out.println("Hasta luego!");
                    break;
                }
            }

        } while (opcion > 0 && opcion <= 5);
    }
    public static void mostrarMenu() {
        System.out.println("MENU "
                + "\n1. Sumar "
                + "\n2. Restar "
                + "\n3. Multiplicar "
                + "\n4. Dividir "
                + "\n5. Salir "
                + "\nElija opción:");
    }
}
