/*
 @author Camilla Sarmento
 */

package insureFast;

import jdk.jshell.spi.ExecutionControl;

import java.io.File;
import java.util.*;
import java.time.LocalDate;

public class AgenteSeguro extends Persona {
        // Declaramos los atributos como privados
        private List<Cliente> clientesActivos;
        private List<Reclamacion> reclamaciones;

    public AgenteSeguro(String nombre, String apellidos, int id, String status, String correo, int telefono,
                        String direccion, String contrasenya, LocalDate fechaNacimiento) {
        super(nombre, apellidos, id, status, correo, telefono, direccion, contrasenya, fechaNacimiento, "AgenteSeguro");
        this.clientesActivos = new ArrayList<Cliente>();
        this.reclamaciones = new ArrayList<Reclamacion>();
    }
    public Cliente crearCliente(String nombre, String apellidos, int id, String status, String correo, int telefono,
                                String direccion, String contrasenya, LocalDate fechaNacimiento, String dni, int edad,
                                float prima, LocalDate fechaCaducidad) {
        for (Cliente c : clientesActivos) {
            if (c.getId() == id) {
                return c;
            }
        }
        Cliente cliente = new Cliente(nombre, apellidos, id, status, correo, telefono, direccion, contrasenya,
                fechaNacimiento, dni, edad, prima, fechaCaducidad);
        clientesActivos.add(cliente);
        return cliente;
    }

    public boolean gestionarReclamacion(int id, String status) {
        for (Reclamacion r : reclamaciones) {
            if (r.getId() == id) {
                r.setStatus(status);
                return true;
            }
        }
        return false;
    }

    public File generarInforme(Cliente cliente, Poliza poliza, Reclamacion reclamacion) {
        // TODO
        return null;
        // throw new UnsupportedOperationException();
    }
}




/*
Métodos:  +crearCliente(String nombre, String apellidos, Int id, String status,  String correo, Int telefono, String direccion, String contrasenya, Date fechaNacimiento, String rol): Boolean,
+gestionarReclamacion(Int id, String status): Boolean,
+generarInforme(Cliente cliente, Poliza poliza, Reclamacion reclamacion): File
+filtroReclamacionPorTipo(): Boolean
 */
