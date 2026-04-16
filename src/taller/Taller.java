package taller;

public class Taller {
    private String nombre;

    public Taller(String nombre) {
        this.nombre = nombre;
    }

    public void asignarReparacion(Mecanico mecanico, Reparacion reparacion) {
        mecanico.reparar(reparacion);
    }
}
