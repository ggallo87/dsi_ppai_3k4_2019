package utn.dsi.entrega5.aplicacion.entidades.guardia_bombero_estados;

import utn.dsi.entrega5.aplicacion.entidades.Bombero;
import utn.dsi.entrega5.aplicacion.entidades.GuardiaBombero;

import java.util.Date;

public abstract class EstadoGuardiaBombero {

    public EstadoGuardiaBombero() {

    }

    public boolean esEnCurso(GuardiaBombero guardiaBombero) {
        return false;
    }

    public void reprogramar(GuardiaBombero guardiaBombero) {

    }

    public void finalizar(GuardiaBombero guardiaBombero) {

    }

    public void registrarAceptacion(GuardiaBombero guardiaBombero) {

    }

    public void cancelar(GuardiaBombero guardiaBombero) {

    }

    public void cancelarDetencion(GuardiaBombero guardiaBombero) {

    }

    public void crearAsistencia(GuardiaBombero guardiaBombero, Date fechaHoraActual, Bombero bombero) {

    }

    public void detener(GuardiaBombero guardiaBombero) {

    }

    public void rechazar(GuardiaBombero guardiaBombero) {

    }
}
