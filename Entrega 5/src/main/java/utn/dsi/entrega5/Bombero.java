package utn.dsi.entrega5;

import java.util.ArrayList;
import java.util.Date;

public class Bombero {
    private boolean activo;
    private String apellido;
    private String direccion;
    private String dni;
    private String email;
    private Date fechaNacimiento;
    private String telefono;
    private ArrayList<Asistencia> asistencias;


    public Bombero() {
        asistencias = new ArrayList<>();
    }

    public boolean esActivo() {
        return activo;
    }

    public String mostrarAsistencia() {
        return "";
    }

    public String mostrarDatos() {
        // TODO: toString
        return "";
    }

    public void registrarIngreso(Asistencia asistencia) {
        this.asistencias.add(asistencia);
    }

    public boolean existeBombero(String dni) {
        return this.dni.equals(dni);
    }

    public boolean existeAsistenciaSinEgreso() {
        if (asistencias.isEmpty()) return true;

        for (Asistencia asistencia : asistencias) {
            if (asistencia.existeAsistenciaSinEgreso()) {
                return true;
            }
        }
        return false;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
