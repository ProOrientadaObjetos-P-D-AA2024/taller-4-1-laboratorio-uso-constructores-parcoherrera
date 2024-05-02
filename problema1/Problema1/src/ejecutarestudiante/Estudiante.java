package ejecutarestudiante;

public class Estudiante {

    private String nombreEstudiante;
    private double califMateria1, califMateria2, califMateria3, promedio;
    private Universidad uni;

    public Estudiante(String nombreEstudiante, double califMateria1, double califMateria2, double califMateria3, Universidad uni) {
        this.nombreEstudiante = nombreEstudiante;
        this.califMateria1 = califMateria1;
        this.califMateria2 = califMateria2;
        this.califMateria3 = califMateria3;
        this.uni = uni;
    }

    public Estudiante(String nombreEstudiante, double califMateria1, double califMateria2, Universidad uni) {
        this.nombreEstudiante = nombreEstudiante;
        this.califMateria1 = califMateria1;
        this.califMateria2 = califMateria2;
        califMateria3 = 8.2;
        this.uni = uni;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double getCalifMateria1() {
        return califMateria1;
    }

    public void setCalifMateria1(double califMateria1) {
        this.califMateria1 = califMateria1;
    }

    public double getCalifMateria2() {
        return califMateria2;
    }

    public void setCalifMateria2(double califMateria2) {
        this.califMateria2 = califMateria2;
    }

    public double getCalifMateria3() {
        return califMateria3;
    }

    public void setCalifMateria3(double califMateria3) {
        this.califMateria3 = califMateria3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        promedio = (califMateria1 + califMateria2 + califMateria3) / 3;
    }

    public Universidad getUni() {
        return uni;
    }

    public void setUni(Universidad uni) {
        this.uni = uni;
    }

    @Override
    public String toString() {
        return "ESTUDIANTE\n"
                + "Nombre: " + nombreEstudiante + "\n"
                + "Calificación de materia 1: " + califMateria1 + "\n"
                + "Calificación de materia 2: " + califMateria2 + "\n"
                + "Calificación de materia 3: " + califMateria3 + "\n"
                + "Promedio: " + promedio + "\n"
                + "UNIVERSIDAD\n"
                + "Nombre: " + getUni().getNombre() + "\n"
                + "Dirección: " + getUni().getDireccion() + "\n";
    }

}
