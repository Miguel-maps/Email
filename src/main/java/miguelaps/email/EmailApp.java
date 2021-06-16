
package miguelaps.email;

import java.util.Scanner;

/**
 *
 * @author Miguel-maps
 */
public class EmailApp {

    // Test

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al asistente para crear una cuenta de email.");
        System.out.println("Introduzca el nombre de la empresa:");
        String empresa = scan.nextLine();
        System.out.println("Introduzca el nombre del usuario:");
        String nombre = scan.nextLine();
        System.out.println("Introduzca el apellido del usuario:");
        String apellidos = scan.nextLine();
        
        Email em1 = new Email(nombre, apellidos, empresa);
        System.out.println("");
        System.out.println(em1.informacion());
        
    }
    
}
