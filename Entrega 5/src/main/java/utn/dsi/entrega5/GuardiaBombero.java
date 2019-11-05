package utn.dsi.entrega5;

import utn.dsi.entrega5.guardia_bombero_estados.EnCurso;
import utn.dsi.entrega5.guardia_bombero_estados.EstadoGuardiaBombero;

import java.util.Date;

public class GuardiaBombero {

    private Date horaDesde;
    private Date horaHasta;
    private String motivoRechazo;
    private EstadoGuardiaBombero estado;
    private Bombero bombero;

    public GuardiaBombero() {
        estado = new EnCurso();
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

    public Date getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(Date horaDesde) {
        this.horaDesde = horaDesde;
    }

    public Date getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(Date horaHasta) {
        this.horaHasta = horaHasta;
    }

    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(String motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }

    public Bombero getBombero() {
        return bombero;
    }

    public void setBombero(Bombero bombero) {
        this.bombero = bombero;
    }
}
