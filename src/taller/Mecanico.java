package taller;

public class Mecanico implements Especialista {
    private String nombre;

    public Mecanico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reparar(Reparacion reparacion) {
        // pendiente de implementar
    }
}