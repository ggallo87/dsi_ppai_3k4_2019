package utn.dsi.entrega5.presentacion;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import utn.dsi.entrega5.aplicacion.entidades.Datos;
import utn.dsi.entrega5.aplicacion.entidades.Util;
import utn.dsi.entrega5.aplicacion.gestores.InterfazIngreso;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class PantallaIngreso implements Initializable {

    @FXML
    private Button btnIngresarHuella;


    /**
     * Inicia la pantalla
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Carga datos iniciales
        Datos.getInstance().cargarDatos();


    }

    /**
     * Ejecuta la acción del botón Ingresar Huella
     */
    @FXML
    public void ingresarHuella() {
        // Aquí se debería procesar la huella y nos da los siguientes datos:
        String dni = "24653915";
        Date fecha = Util.crearFechaHora(6, 11, 2019, 4, 0);

        // Se manda a registrar el ingreso
        InterfazIngreso.getInstance().informeIngreso(dni, fecha);


        /*Asistencia a = Datos.getInstance().obtenerBomberos().get(0).asistencias.get(0);
        System.out.println("llegada " + a.getFechaHoraLlegada());
        System.out.println("salida " + a.getFechaHoraSalida());*/
    }

}
