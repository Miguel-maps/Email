package miguelaps.email;

import java.util.Scanner;

/**
 *
 * @author Miguel-maps
 */
public class Email {

    private String email;
    private String nombre;
    private String apellidos;
    private String password;
    private String departamento;
    private int capacidadEmail;
    private String emailAlternativo;
    private String empresa = "empresa.com";

    public Email(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        System.out.println("Creando email para el usuario " + this.nombre + " " + this.apellidos);
        // Establecer el departamento del usuario
        this.departamento = setDepartamento();
        System.out.println("Departamento: " + this.departamento);
        // Crear la dirección de correo electrónico
        this.email = this.nombre.toLowerCase() + "." + this.apellidos.toLowerCase() + "@" + this.departamento.toLowerCase() + "." + this.empresa.toLowerCase();
        System.out.println("Email: " + this.email);
        // Generar contraseña aleatoria
        this.password = randomPassword(8);
        System.out.println("Contraseña generada aleatoriamente: " + this.password);
    }

    // Establecer departamento del usuario
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

    // Generar contraseña aleatoriamente
    private String randomPassword(int cantidadCaracteres) {
        String passwordSet = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789_.#%&?";
        char[] password = new char[cantidadCaracteres];
        for (int i = 0; i < cantidadCaracteres; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

}
