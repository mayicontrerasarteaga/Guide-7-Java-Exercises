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
public class ej12 {
    
    public static void main(String[] args) {
        
        System.out.println("Este es un dispositivo RS232"
                + "\nIngrese un código de máximo 5 carácteres"
                + "\nEl primer carácter tiene que ser X y el último tiene que ser una O."
                + "\nLa secuencia especial '&&&&&' indica el final de las entradas."
                + "\nAl final se entregará un reporte de lecturas correctas e incorrectas");
        
        String codigo;
        String primerCaracter;
        String ultimoCaracter;
        String codigoFinal;
        int lecturaCorrecta;
        int lecturaIncorrecta;
        int maxCaracter;
        
        primerCaracter = "X";
        ultimoCaracter = "O";
        codigoFinal = "&&&&&";
        maxCaracter = 5;
        lecturaCorrecta = 0;
        lecturaIncorrecta =0;
        
        Scanner in = new Scanner(System.in);
        
        do {
            codigo = in.nextLine();
            
            if (codigo.length() <= maxCaracter && codigo.startsWith(primerCaracter) && codigo.endsWith(ultimoCaracter)) {
                lecturaCorrecta = lecturaCorrecta + 1;
            } else {
                lecturaIncorrecta = lecturaIncorrecta + 1;
            }
            
            if (codigo.equals(codigoFinal)) {
                lecturaIncorrecta = lecturaIncorrecta - 1;
            }
            
        } while (!codigo.equals(codigoFinal) );
    
        System.out.println("--Reporte Final--"
                + "\nNúmero de lecturas correctas:" + lecturaCorrecta
                + "\nNúmero de lecturas incorrectas:" + lecturaIncorrecta);
    }
}
