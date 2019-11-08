package utn.dsi.entrega5.aplicacion.gestores;

import utn.dsi.entrega5.aplicacion.entidades.Bombero;
import utn.dsi.entrega5.aplicacion.entidades.Datos;
import utn.dsi.entrega5.aplicacion.entidades.ProgramacionGuardia;

import java.util.ArrayList;
import java.util.Date;

public class GestorIngreso {

    public GestorIngreso() {

    }

    /**
     * Informa un ingreso para registrar una nueva asistencia.
     */
    public void informeIngreso(String dni, Date fechaHoraActual) {
        // Verifica si existe el bombero con tal DNI
        Bombero bombero = existeBombero(dni);
        if (bombero == null) throw new IllegalArgumentException("No se encontro un bombero con tal DNI");

        // Verifica si no hay asistencias sin egreso
        boolean asistenciaSinEgreso = existeAsistenciaSinEgreso(bombero);
        if (!asistenciaSinEgreso) throw new IllegalArgumentException("No hay asistencia sin egreso para este bombero");

        // Busca una programacion de guardia vigente
        ProgramacionGuardia programacionVigente = existeProgramacionGuardiaVigente();
        if (programacionVigente == null) throw new IllegalArgumentException("No existe programacion vigente");

        // Verifica si hay una guardia en curso y crea la asistencia
        verificarYCrearAsistencia(fechaHoraActual, bombero, programacionVigente);


        finCU();
    }

    /**
     * Devuelve un bombero con un DNI específico
     */
    private Bombero existeBombero(String dni) {
        ArrayList<Bombero> bomberos = Datos.getInstance().obtenerBomberos();
            for (Bombero bombero : bomberos) {
            if (bombero.existeBombero(dni) && bombero.esActivo()) {
                return bombero;
            }
        }
        return null;
    }

    /**
     * Delega a la programacion de guardia la creación de una asistencia
     */
    public void verificarYCrearAsistencia(Date fechaHoraActual, Bombero bombero, ProgramacionGuardia programacionGuardia) {
        programacionGuardia.crearAsistecia(fechaHoraActual, bombero);
    }

    private boolean existeAsistenciaSinEgreso(Bombero bombero) {
        return bombero.existeAsistenciaSinEgreso();
    }

    /**
     * Devuelve la programacion de guardia vigente si es que la hay
     */
    public ProgramacionGuardia existeProgramacionGuardiaVigente() {
        ArrayList<ProgramacionGuardia> programacionesGuardia = Datos.getInstance().obtenerProgramacionesGuardia();

        for (ProgramacionGuardia programacionGuardia : programacionesGuardia) {
            if (programacionGuardia.sosVigente()) {
                return programacionGuardia;
            }
        }
        return null;
    }


    public void finCU() {
        System.out.println("Asistencia registrada correctamente!");
    }


}
