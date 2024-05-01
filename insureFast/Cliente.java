/*
 @author Camilla Sarmento
 */

package insureFast;
import java.util.*;
import java.time.LocalDate;

public class Cliente extends Persona {
    // Declaramos los atributos como privados
    private String dni;
    private int edad;
    private List<Poliza> polizaContratada;
    private float prima;
    private LocalDate fechaCaducidad;
    private List<Reclamacion> reclamaciones;


    public Cliente(String nombre, String apellidos, int id, String status, String correo, int telefono,
                   String direccion, String contrasenya, LocalDate fechaNacimiento, String dni, int edad,
                   float prima, LocalDate fechaCaducidad) {
        super(nombre, apellidos, id, status, correo, telefono, direccion, contrasenya, fechaNacimiento, "Cliente");
        this.dni = dni;
        this.edad = edad;
        this.polizaContratada = new ArrayList<>();
        this.prima = prima;
        this.fechaCaducidad = fechaCaducidad;
        this.reclamaciones = new ArrayList<>();
    }

    public Poliza busquedaPolizaNombre(String nombre) {
        for (Poliza p : polizaContratada) {
            if (p.getNombre().equals(nombre)) {
                 return p;
            }
        }

        return null;
    }

    public Poliza busquedaPolizaTipo(String tipo) {
        for (Poliza p : polizaContratada) {
            if (p.getTipo().equals(tipo)) {
                return p;
            }
        }

        return null;
    }

    public Poliza busquedaPolizaCobertura(String cobertura) {
        for (Poliza p : polizaContratada) {
            for (String c : p.getCoberturas()) {
                if (c.equals(cobertura)) {
                    return p;
                }
            }
        }

        return null;
    }

    public float calculoPrimaPorCliente(float precio) {
        this.prima = 0;
        for (Poliza p : polizaContratada) {
            this.prima = this.prima + p.getPrecio();
        }
        this.prima += precio;
        return this.prima;
    }

    public boolean realizarPago( ) {
        // TODO
        return false;
    }

    public boolean crearReclamacion(String nombre, int id, String tipo, String status) {
        for (Reclamacion r : reclamaciones) {
            if (r.getId() == id) {
                return false;
            }
        }
        Reclamacion reclamacion = new Reclamacion(nombre, id, tipo, status);
        reclamaciones.add(reclamacion);
        return true;
    }

    public void anadirPoliza(Poliza poliza) {
        polizaContratada.add(poliza);
    }

}

/*
Métodos:  +busquedaPolizaNombre(String nombre):List<Poliza>,
        +busquedaPolizaTipo(String tipo):List<Poliza>,
        +busquedaPolizaCobertura (List coberturas):List<Poliza>,
        +calculoPrimaPorCliente(Float precio): float,
        +realizarPago( ): boolean
 +crearReclamacion(): Boolean,*/

