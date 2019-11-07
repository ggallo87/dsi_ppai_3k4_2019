package utn.dsi.entrega5.guardia_bombero_estados;

import utn.dsi.entrega5.Bombero;
import utn.dsi.entrega5.GuardiaBombero;

import java.util.Date;

public class PendienteConfirmacion implements EstadoGuardiaBombero {

    public PendienteConfirmacion() {

    }


    @Override
    public void reprogramar(GuardiaBombero guardiaBombero) {

    }

    @Override
    public void finalizar(GuardiaBombero guardiaBombero) {

    }

    @Override
    public void registrarAceptacion(GuardiaBombero guardiaBombero) {

    }

    @Override
    public void cancelar(GuardiaBombero guardiaBombero) {

    }

    @Override
    public void cancelarDetencion(GuardiaBombero guardiaBombero) {

    }

    @Override
    public void crearAsistencia(GuardiaBombero guardiaBombero, Date fechaHoraActual, Bombero bombero) {

    }

    @Override
    public boolean esEnCurso(GuardiaBombero guardiaBombero) {
        return false;
    }

    @Override
    public void detener(GuardiaBombero guardiaBombero) {

    }

    @Override
    public void rechazar(GuardiaBombero guardiaBombero) {

    }
}
