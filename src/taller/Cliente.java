package taller;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
}