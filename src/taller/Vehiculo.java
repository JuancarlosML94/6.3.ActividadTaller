package taller;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    private String matricula;
    private String modelo;
    private List<Reparacion> historialReparaciones;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.historialReparaciones = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Reparacion> getHistorialReparaciones() {
        return historialReparaciones;
    }

    public void addReparacion(Reparacion reparacion) {
        historialReparaciones.add(reparacion);
    }
}