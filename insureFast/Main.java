/*
 @author Camilla Sarmento
 */

package insureFast;

import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] arg) {
        Persona usuario = Persona.crearUsuario("Marta", "Gama", 1, "activo", "marta@blabla.com",
                12345678, "Carrer A 123", "1234",
                LocalDate.of(2000, 5, 30));
        System.out.println("Detalles del usuario creado:"+usuario.getNombre());

        boolean logado = usuario.iniciarSesion("mia@blabla.com", "1234");

        if (logado) {
            AgenteSeguro agente1 = new AgenteSeguro("Juan", "Beta", 2, "activo",
                    "alfa@hotmail.com", 3453532, "direccion", "alfabeta",
                    LocalDate.of(1987, 5,14 ));

            Cliente cliente1 = agente1.crearCliente("Maria", "Alfa", 3, "activo",
                    "mariaalfa@hotmail.com", 3453532, "direccion", "alfagama",
                    LocalDate.of(1987, 5, 17), "G78766384H", 37, 0,
                    LocalDate.of(2031, 5, 30));

            Poliza poliza1 = new Poliza(cliente1, "nombre poliza 1", 100, "hogar", 100,
                    Arrays.asList("cobertura 1", "cobertura 2"),
                    Arrays.asList("exclusion 1", "exclusion 2"),
                    Arrays.asList("requisito 1", "requisito 2"),
                    LocalDate.of(2031, 5, 30));

            Poliza poliza2 = new Poliza(cliente1, "nombre poliza 2", 101, "vida", 200,
                    Arrays.asList("cobertura 3"),
                    Arrays.asList("exclusion 3", "exclusion 4"),
                    Arrays.asList("requisito 3"),
                    LocalDate.of(2031, 5, 30));

            Poliza busqueda = cliente1.busquedaPolizaCobertura("cobertura 2");
            System.out.println(busqueda.getNombre());

            busqueda = cliente1.busquedaPolizaNombre("nombre poliza 1");
            System.out.println(busqueda.getNombre());

            busqueda = cliente1.busquedaPolizaTipo("vida");
            System.out.println(busqueda.getNombre());

            float prima = cliente1.calculoPrimaPorCliente(500);
            System.out.println(prima);


        }
    }
}









