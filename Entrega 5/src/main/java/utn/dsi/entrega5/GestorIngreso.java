package utn.dsi.entrega5;

import java.util.ArrayList;
import java.util.Date;

public class GestorIngreso {

    private Bombero bombero;
    private Date fechaIngreso;

    public GestorIngreso() {

    }

    public void asistir() {

    }

    public void informeIngreso(String dni, Date fechaHoraActual) {
        Bombero bombero = existeBombero(dni);

        if (bombero == null) throw new IllegalArgumentException("No se encontro un bombero con tal DNI");

        boolean asistenciaSinEgreso = existeAsistenciaSinEgreso(bombero);

        if (!asistenciaSinEgreso) throw new IllegalArgumentException("No hay asistencia sin egreso para este bombero");

        ProgramacionGuardia programacionVigente = existeProgramacionGuardiaVigente();

        if (programacionVigente == null) throw new IllegalArgumentException("No existe programacion vigente");

        verificarYCrearAsistencia(fechaHoraActual, bombero, programacionVigente);

        finCU();
    }

    private Bombero existeBombero(String dni) {
        ArrayList<Bombero> bomberos = Datos.getInstance().obtenerBomberos();
            for (Bombero bombero : bomberos) {
            if (bombero.existeBombero(dni) && bombero.esActivo()) {
                return bombero;
            }
        }
        return null;
    }

    public void verificarYCrearAsistencia(Date fechaHoraActual, Bombero bombero, ProgramacionGuardia programacionGuardia) {
        programacionGuardia.crearAsistecia(fechaHoraActual, bombero);
    }

    private boolean existeAsistenciaSinEgreso(Bombero bombero) {
        return bombero.existeAsistenciaSinEgreso();
    }

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

    }


}
