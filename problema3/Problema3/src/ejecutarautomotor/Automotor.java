package ejecutarautomotor;

public class Automotor {

    private String cedulaDuenio;
    private int anioFabricacion;
    private double valorVehiculo, valorMatricula;
    private Fabricante fab;

    public Automotor(String cedulaDuenio, int anioFabricacion, double valorVehiculo, Fabricante fab) {
        this.cedulaDuenio = cedulaDuenio;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.fab = fab;
    }

    public Automotor(String cedulaDuenio, int anioFabricacion, Fabricante fab) {
        this.cedulaDuenio = cedulaDuenio;
        this.anioFabricacion = anioFabricacion;
        valorVehiculo = 4000;
        this.fab = fab;
    }

    public String getCedulaDuenio() {
        return cedulaDuenio;
    }

    public void setCedulaDuenio(String cedulaDuenio) {
        this.cedulaDuenio = cedulaDuenio;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        valorMatricula = 0.00002 * valorVehiculo * (2024 - anioFabricacion);
    }

    public Fabricante getFab() {
        return fab;
    }

    public void setFab(Fabricante fab) {
        this.fab = fab;
    }
    
    @Override
    public String toString() {
        return "AUTOMOTOR\n"
                + "Cedula dueño: " + cedulaDuenio + "\n"
                + "Año de fabricacion: " + anioFabricacion + "\n"
                + "Valor del vehículo: " + valorVehiculo + "\n"
                + "Valor de la matrícula: " + valorMatricula + "\n"
                + "FABRICANTE\n"
                + "Nombre: " + getFab().getNombreFabricante() + "\n"
                + "Ciudad de origen: " + getFab().getCiudadOrigen() + "\n";
    }

}
