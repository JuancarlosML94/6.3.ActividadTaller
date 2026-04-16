package taller;

public class Reparacion {
    private String descripcion;
    private String fecha;
    private double coste;

    public Reparacion(String descripcion, String fecha, double coste) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.coste = coste;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}