package utn.dsi.entrega5.guardia_bombero_estados;

import utn.dsi.entrega5.Bombero;
import utn.dsi.entrega5.GuardiaBombero;

import java.util.Date;

public interface EstadoGuardiaBombero {

    void reprogramar(GuardiaBombero guardiaBombero);

    void finalizar(GuardiaBombero guardiaBombero);

    void registrarAceptacion(GuardiaBombero guardiaBombero);

    void cancelar(GuardiaBombero guardiaBombero);

    void cancelarDetencion(GuardiaBombero guardiaBombero);

    void crearAsistencia(GuardiaBombero guardiaBombero, Date fechaHoraActual, Bombero bombero);

    boolean esEnCurso(GuardiaBombero guardiaBombero);

    void detener(GuardiaBombero guardiaBombero);

    void rechazar(GuardiaBombero guardiaBombero);
}
