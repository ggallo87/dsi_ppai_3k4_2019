package utn.dsi.entrega5.aplicacion.gestores;

import utn.dsi.entrega5.aplicacion.entidades.Datos;

import java.util.Date;

/**
 * Interfaz intermediaria para comunicarse con nuestro software.
 *
 * Un lector de huellas debe hacer uso de éste.
 */
public class InterfazIngreso {

    private static InterfazIngreso instance;

    public static InterfazIngreso getInstance() {
        if (instance == null) instance = new InterfazIngreso();
        return instance;
    }

    private InterfazIngreso() {

    }

    /**
     * Manda a procesar un nuevo ingreso
     */
    public void informeIngreso(String dni, Date fechaHora) {

        GestorIngreso gestorIngreso = new GestorIngreso();
        gestorIngreso.informeIngreso(dni, fechaHora);

        // Muestra la ultima asistencia (es decrir, la recientemente creada)
        String ultimaAsistencia = Datos.getInstance().mostrarDatosUltimaAsistencia();
        System.out.println("\n\nAsistencia: \n" + ultimaAsistencia);
    }


}
