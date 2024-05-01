/*
 @author Camilla Sarmento
 */

package insureFast;


public class Reclamacion {
    // Declaramos los atributos como privados
    private String nombre;
    private int id;
    private String tipo;
    private String status;

    public Reclamacion(String nombre, int id, String tipo, String status) {
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

