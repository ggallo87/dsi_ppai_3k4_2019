package utn.dsi.entrega5;

public class Main {
    public static void main(String[] args) {
        Datos.getInstance().cargarDatos();

        GestorIngreso gestorIngreso = new GestorIngreso();

        gestorIngreso.informeIngreso("24653915", Util.crearFechaHora(6, 11, 2019, 4, 0));

        Asistencia a = Datos.getInstance().obtenerBomberos().get(0).asistencias.get(0);
        System.out.println("llegada " + a.getFechaHoraLlegada());
        System.out.println("salida " + a.getFechaHoraSalida());
    }
}
