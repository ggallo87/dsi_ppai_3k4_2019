package utn.dsi.entrega5;

import utn.dsi.entrega5.guardia_bombero_estados.EstadoGuardiaBombero;

import java.util.Date;

public class GuardiaBombero {

    private Date horaDesde;
    private Date horaHasta;
    private Date motivoRechazo;
    private EstadoGuardiaBombero estado;
    private Bombero bombero;

    public GuardiaBombero() {

    }

    public void setEstado(EstadoGuardiaBombero estado) {
        this.estado = estado;
    }

    public void mostrarDatos() {

    }

    public boolean esEnCursoYDeBombero(Bombero bombero) {
        boolean enCurso = estado.esEnCurso(this);
        boolean esBombero = this.bombero.equals(bombero);

        return enCurso && esBombero;
    }

    public void crearAsistencia(Date fechaHoraActual) {
        estado.crearAsistencia(this, fechaHoraActual, bombero);
    }
}
