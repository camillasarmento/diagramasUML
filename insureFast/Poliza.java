/*
 @author Camilla Sarmento
 */

package insureFast;

import java.util.*;
import java.time.LocalDate;



public class Poliza {
    // Declaramos los atributos como privados
    private String nombre;
    private int id;
    private String tipo;
    private float precio;
    private List<String> coberturas = new ArrayList<>();
    private List<String> exclusiones = new ArrayList<>();
    private List<String> requisitos = new ArrayList<>();
    private LocalDate fechaCaducidad;

    public Poliza(Cliente cliente, String nombre, int id, String tipo, float precio, List<String> coberturas, List<String> exclusiones, List<String> requisitos, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
        this.coberturas = coberturas;
        this.exclusiones = exclusiones;
        this.requisitos = requisitos;
        this.fechaCaducidad = fechaCaducidad;

        cliente.anadirPoliza(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public List<String> getCoberturas() {
        return coberturas;
    }

    public void setCoberturas(List<String> coberturas) {
        this.coberturas = coberturas;
    }

    public List<String> getExclusiones() {
        return exclusiones;
    }

    public void setExclusiones(List<String> exclusiones) {
        this.exclusiones = exclusiones;
    }

    public List<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}


/*Métodos:+contratarPoliza(String tipo, Float precio, Date fechaCaducidad, Cliente): boolean,
+renovarPoliza(String tipo, Float precio, Date fechaCaducidad, Cliente): boolean
 */