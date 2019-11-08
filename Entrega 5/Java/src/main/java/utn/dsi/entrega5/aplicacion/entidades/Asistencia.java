package utn.dsi.entrega5.aplicacion.entidades;

import java.util.Date;

public class Asistencia {
    private Date fechaHoraLlegada;
    private Date fechaHoraSalida;
    private GuardiaBombero guardiaBombero;

    public Asistencia() {

    }

    public void getGuardiaBombero() {

    }

    public String mostrarDatos() {
        return "FechaHoraLlegada: " + fechaHoraLlegada + ", FechaHoraSalida: " + fechaHoraSalida + ".\n\n" +
                "Guardia Bombero:\n\t" + guardiaBombero.mostrarDatos();
    }

    public boolean existeAsistenciaSinEgreso() {
        return fechaHoraSalida == null;
    }

    public Date getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(Date fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public void setGuardiaBombero(GuardiaBombero guardiaBombero) {
        this.guardiaBombero = guardiaBombero;
    }
}
