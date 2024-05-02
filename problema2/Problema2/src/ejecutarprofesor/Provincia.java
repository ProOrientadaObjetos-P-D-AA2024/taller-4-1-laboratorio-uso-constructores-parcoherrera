package ejecutarprofesor;

public class Provincia {
    
    private String NombreProvincia;
    private int NumeroHabitantes;

    public Provincia(String NombreProvincia, int NumeroHabitantes) {
        this.NombreProvincia = NombreProvincia;
        this.NumeroHabitantes = NumeroHabitantes;
    }

    public String getNombreProvincia() {
        return NombreProvincia;
    }

    public void setNombreProvincia(String NombreProvincia) {
        this.NombreProvincia = NombreProvincia;
    }

    public int getNumeroHabitantes() {
        return NumeroHabitantes;
    }

    public void setNumeroHabitantes(int NumeroHabitantes) {
        this.NumeroHabitantes = NumeroHabitantes;
    }
    
}
