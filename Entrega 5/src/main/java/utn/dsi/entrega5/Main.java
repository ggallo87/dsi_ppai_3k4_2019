package utn.dsi.entrega5;

public class Main {
    public static void main(String[] args) {
        Datos.getInstance().cargarDatos();

        GestorIngreso gestorIngreso = new GestorIngreso();

        gestorIngreso.informeIngreso("24653915", Util.crearFecha(4, 11, 2019));
    }
}
