package utn.dsi.entrega5;

public class Estado {

    private String nombre;
    private String ambito;
    private String descripcion;

    public Estado() {

    }

    public boolean esAmbito(String ambito) {
        return ambito.equals(this.ambito);
    }

    public boolean sosEstado(String nombre) {
        return nombre.equals(this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
