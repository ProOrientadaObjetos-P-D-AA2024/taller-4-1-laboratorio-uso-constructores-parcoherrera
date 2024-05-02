package ejecutarcheque;

public class Banco {

    String nombre;
    int nroSucursales;

    public Banco(String nombre, int nroSucursales) {
        this.nombre = nombre;
        this.nroSucursales = nroSucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroSucursales() {
        return nroSucursales;
    }

    public void setNroSucursales(int nroSucursales) {
        this.nroSucursales = nroSucursales;
    }

}
