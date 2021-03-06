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
    private int capacidadEmail = 500;
    private String empresa;

    public Email(String nombre, String apellidos, String empresa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.empresa = empresa;
        System.out.println("Creando email para el usuario " + this.nombre + " " + this.apellidos);
        // Establecer el departamento del usuario
        this.departamento = setDepartamento();
        // Crear la dirección de correo electrónico
        this.email = this.nombre.toLowerCase() + "." + this.apellidos.toLowerCase() + "@" + this.departamento.toLowerCase() + "." + empresa.toLowerCase() + ".com";
        // Generar contraseña aleatoria
        this.password = randomPassword(8);
    }

    // Establecer departamento del usuario
    private String setDepartamento() {
        System.out.println("Introduzca el código del departamento para este usuario:\n[1] Desarrollo \n[2] Mantenimiento \n[3] Contabilidad \n[0] Dejar en blanco");
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
                return "";
        }
    }

    // Generar contraseña aleatoriamente
    private String randomPassword(int cantidadCaracteres) {
        String passwordSet = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789_#%&?";
        char[] password = new char[cantidadCaracteres];
        for (int i = 0; i < cantidadCaracteres; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // Establecer capacidad del email diferente a la default del constructor
    public void setCapacidadEmail(int capacidad) {
        this.capacidadEmail = capacidad;
    }

    // Cambiar contraseña
    public void cambiarPassword(String nuevaPassword) {
        this.password = nuevaPassword;
    }

    // Cambiar empresa
    public void setEmpresa(String nuevaEmpresa) {
        this.empresa = nuevaEmpresa;
    }

    // Getters
    public String getEmail() {
        return this.email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public int getCapacidadEmail() {
        return this.capacidadEmail;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public String informacion() {
        return "Nombre: " + getNombre() + "\nApellidos: " + getApellidos() + "\nEmail: " + getEmail() + "\nContraseña: " + getPassword();
    }

}
