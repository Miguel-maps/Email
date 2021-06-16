package miguelaps.email;

import java.util.Scanner;

/**
 *
 * @author Miguel-maps
 */
public class Email {

    private String nombre;
    private String apellidos;
    private String contraseña;
    private String departamento;
    private int capacidadEmail;
    private String emailAlternativo;

    public Email(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        System.out.println("Creando email para el usuario " + this.nombre + " " + this.apellidos);
        this.departamento = setDepartamento();
        System.out.println("Departamento: " + this.departamento);
    }

    private String setDepartamento() {
        System.out.println("Introduzca el código del departamento\n[1] Desarrollo \n[2] Mantenimiento \n[3] Contabilidad \n[0] Dejar en blanco");
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                return "Dev";
            case 2:
                return "Mantenimiento";
            case 3:
                return "Contabilidad";
            default:
                return "(ninguno)";
        }
    }

}
