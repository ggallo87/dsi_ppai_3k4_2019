package utn.dsi.entrega5;

import java.util.ArrayList;
import java.util.Date;

public class ProgramacionGuardia {
    private Date fechaDesde;
    private Date fechaHasta;
    private Estado estado;
    private ArrayList<GuardiaBombero> guardiasBombero;

    public ProgramacionGuardia() {
        guardiasBombero = new ArrayList<>();

        estado = new Estado();
        estado.setAmbito("utn.dsi.entrega5.ProgramacionGuardia");
        estado.setNombre("Vigente");
    }

    public void crearGuardias() {

    }

    public void getEstado() {

    }

    public boolean sosVigente() {
        return estado.sosEstado("EnCurso");
    }

    public void existeGuardiaBombero() {
        //   todo hacer loop
    }

    public void crearAsistecia(Date fechaHoraActual, Bombero bombero) {
        GuardiaBombero guardiaBombero = buscarGuardiaEnCurso(bombero);

        if (guardiaBombero == null) throw new IllegalArgumentException("No hay una guardia en curso para este bombero");

        guardiaBombero.crearAsistencia(fechaHoraActual);
    }

    private GuardiaBombero buscarGuardiaEnCurso(Bombero bombero) {
        for (GuardiaBombero guardiaBombero : guardiasBombero) {
            if (guardiaBombero.esEnCursoYDeBombero(bombero)) {
                return guardiaBombero;
            }
        }
        return null;
    }

}
