package taller;

public class Factura {
    private String numero;
    private double importeTotal;
    private Reparacion reparacion;

    public Factura(String numero, double importeTotal, Reparacion reparacion) {
        this.numero = numero;
        this.importeTotal = importeTotal;
        this.reparacion = reparacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }
}