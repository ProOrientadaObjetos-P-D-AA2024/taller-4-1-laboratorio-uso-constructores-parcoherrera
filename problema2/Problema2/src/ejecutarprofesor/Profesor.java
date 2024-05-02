package ejecutarprofesor;

public class Profesor {

    private String nomb, ape, ced;
    private double sb, st;
    private Provincia prov;

    public Profesor(String nomb, String ape, String ced, double sb, Provincia prov) {
        this.nomb = nomb;
        this.ape = ape;
        this.ced = ced;
        this.sb = sb;
        this.prov = prov;
    }

    public Profesor(String nomb, String ape, double sb, Provincia prov) {
        this.nomb = nomb;
        this.ape = ape;
        ced = "1103570840";
        this.sb = sb;
        this.prov = prov;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public double getSb() {
        return sb;
    }

    public void setSb(double sb) {
        this.sb = sb;
    }

    public double getSt() {
        return st;
    }

    public void calcularSt() {
        st = (sb * 0.20) + sb;
    }

    public Provincia getProv() {
        return prov;
    }

    public void setProv(Provincia prov) {
        this.prov = prov;
    }
    
    @Override
    public String toString() {
        return "PROFESOR\n"
                + "Nombre : " + nomb + "\n"
                + "Apellido: " + ape + "\n"
                + "Cedula de identidad: " + ced + "\n"
                + "Sueldo basico: " + sb + "\n"
                + "Sueldo total: " + st + "\n"
                + "PROVINCIA\n"
                + "Nombre: "+getProv().getNombreProvincia()+ "\n"
                + "Numero de habitantes: "+getProv().getNumeroHabitantes()+ "\n";
    }
}
