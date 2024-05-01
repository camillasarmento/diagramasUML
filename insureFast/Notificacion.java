/*
 @author Camilla Sarmento
 */

package insureFast;

import java.time.LocalDate;

public class Notificacion {
    // Declaramos los atributos como privados
    private LocalDate fecha;
    private String text;
    private int id ;

    public Notificacion(LocalDate fecha, String text, int id) {
        this.fecha = fecha;
        this.text = text;
        this.id = id;
    }
}


/*Métodos: +generarNotificacion(String nombre, String tipo, Date fechaCaducidad): String (mensaje),
+enviarNotificacion(String correo): void (enviaria las notificaciones por correo)
*/