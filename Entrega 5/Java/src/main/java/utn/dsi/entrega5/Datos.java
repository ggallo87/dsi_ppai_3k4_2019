package utn.dsi.entrega5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Datos {

    private ArrayList<Bombero> bomberos;
    private ArrayList<ProgramacionGuardia> programacionesGuardia;
    private ArrayList<GuardiaBombero> guardiasBombero;

    private static Datos instance;

    public static Datos getInstance() {
        if (instance == null) instance = new Datos();
        return instance;
    }

    public Datos() {
        bomberos = new ArrayList<>();
        programacionesGuardia = new ArrayList<>();
        guardiasBombero = new ArrayList<>();
    }

    public void cargarDatos() {

        Bombero bombero1 = agregarBombero("Pereyra", "25 de Mayo 2568", "24653915", Util.crearFecha(21, 8, 1974), "3518524698", true);

        ProgramacionGuardia programacionGuardia = agregarProgramacionGuardia(Util.crearFecha(4, 11, 2019), Util.crearFecha(10, 11, 2019), "EnCurso");

        GuardiaBombero guardiaBombero = agregarGuardiaBombero(Util.crearFechaHora(6, 11, 2019, 0, 0), Util.crearFechaHora(6, 11, 2019, 5, 0), bombero1, "EnCruso");

        programacionGuardia.agregarGuardia(guardiaBombero);

    }

    private Bombero agregarBombero(String apellido, String direccion, String dni, Date fechaNacimiento, String telefono, boolean activo) {
        Bombero bombero = new Bombero();
        bombero.setApellido(apellido);
        bombero.setDireccion(direccion);
        bombero.setDni(dni);
        bombero.setFechaNacimiento(fechaNacimiento);
        bombero.setTelefono(telefono);
        bombero.setActivo(activo);

        bomberos.add(bombero);
        return bombero;
    }



    private ProgramacionGuardia agregarProgramacionGuardia(Date fechaDesde, Date fechaHasta, String nombreEstado) {
        ProgramacionGuardia programacionGuardia = new ProgramacionGuardia();
        programacionGuardia.setFechaDesde(fechaDesde);
        programacionGuardia.setFechaHasta(fechaHasta);

        Estado estado = new Estado();
        estado.setAmbito("ProgramacionGuardia");
        estado.setNombre(nombreEstado);
        programacionGuardia.setEstado(estado);

        programacionesGuardia.add(programacionGuardia);
        return programacionGuardia;
    }

    private GuardiaBombero agregarGuardiaBombero(Date horaDesde, Date horaHasta, Bombero bombero, String estado) {
        GuardiaBombero guardiaBombero = new GuardiaBombero();
        guardiaBombero.setHoraDesde(horaDesde);
        guardiaBombero.setHoraHasta(horaHasta);
        guardiaBombero.setBombero(bombero);

        guardiasBombero.add(guardiaBombero);
        return guardiaBombero;
    }

    public ArrayList<Bombero> obtenerBomberos() {
        return bomberos;
    }

    public ArrayList<ProgramacionGuardia> obtenerProgramacionesGuardia() {
        return programacionesGuardia;
    }
}
