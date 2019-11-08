package utn.dsi.entrega5.aplicacion.entidades.guardia_bombero_estados;

import utn.dsi.entrega5.aplicacion.entidades.Asistencia;
import utn.dsi.entrega5.aplicacion.entidades.Bombero;
import utn.dsi.entrega5.aplicacion.entidades.GuardiaBombero;

import java.util.Date;

public class EnCurso extends EstadoGuardiaBombero {

    public EnCurso() {

    }

    @Override
    public boolean esEnCurso(GuardiaBombero guardiaBombero) {
        return true;
    }

    @Override
    public void finalizar(GuardiaBombero guardiaBombero) {

    }

    @Override
    public void cancelar(GuardiaBombero guardiaBombero) {

    }

    @Override
    public void crearAsistencia(GuardiaBombero guardiaBombero, Date fechaHoraActual, Bombero bombero) {
        Asistencia asistencia = new Asistencia();
        asistencia.setFechaHoraLlegada(fechaHoraActual);
        asistencia.setGuardiaBombero(guardiaBombero);

        bombero.registrarIngreso(asistencia);
    }

    @Override
    public void detener(GuardiaBombero guardiaBombero) {

    }
}
