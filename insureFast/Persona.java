/*
 @author Camilla Sarmento
 */

package insureFast;

import java.util.*;
import java.time.LocalDate;

public class Persona {

    // Declaramos los atributos como privados
    private String nombre;
    private String apellidos;
    private int id;
    private String status;
    private String correo;
    private int telefono;
    private String direccion;
    private String contrasenya;
    private LocalDate fechaNacimiento;
    private String rol;
    private boolean sesion;
    private static List<Persona> usuarios = new ArrayList<>();


    //Creamos el constructor público para la clase Producto y le pasamos los argumentos privados que hemos declarado anteriormente (ahora seran accesibles con el constructor)
    public Persona(String nombre, String apellidos, int id, String status, String correo, int telefono, String direccion, String contrasenya, LocalDate fechaNacimiento, String rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.status = status;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contrasenya = contrasenya;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean getSesion() {
        return sesion;
    }

    public boolean iniciarSesion(String correoIngresado, String contrasenaIngresada) {
        if (this.correo.equals(correoIngresado) && this.contrasenya.equals(contrasenaIngresada)) {
            this.sesion = true;
            return true;
        } else {
            return false;
        }
    }

    public static Persona crearUsuario(String nombre, String apellidos, int id, String status,  String correo,
                                       int telefono, String direccion, String contrasenya, LocalDate fechaNacimiento) {
        // verificar se o usuario ja existe (por id) e retornar false nesse caso
        for (Persona p : usuarios) {
            if (p.getId() == id) {
                return p;
            }
        }

//        for (int i = 0; i < usuarios.size(); i++) {
//            Persona p = usuarios.get(i);
//            if (p.getId() == id) {
//                return false;
//            }
//        }

        Persona usuario = new Persona(nombre, apellidos, id, status, correo, telefono, direccion, contrasenya,
                fechaNacimiento, "Usuario");
        usuarios.add(usuario);
        return usuario;
    }

    public static void eliminarUsuario(int id) {
        usuarios.removeIf(persona -> persona.getId() == id);
    }

    public void cerrarSesion() {
        this.sesion = false;
    }

}


    /*+crearUsuario(String nombre, String apellidos, Int id, String status,  String correo, Int telefono, String direccion, String contrasenya, Date fechaNacimiento, String rol): Boolean
     +eliminarUsuario(Int ID) : void
      +get y +set para todos los atributos
      -cerrarSesion(): void
      + modificarDatos():Boolean,
     */


