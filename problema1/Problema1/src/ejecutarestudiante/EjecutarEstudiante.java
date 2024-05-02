package ejecutarestudiante;

public class EjecutarEstudiante {

    public static void main(String[] args) {

        //OBJETO 1
        Universidad uni1 = new Universidad("UTPL", "San Cayetano");
        Estudiante est1 = new Estudiante("Marco Herrera", 9.8, 9.5, 9.2, uni1);
        est1.calcularPromedio();
        System.out.println("----------OBJETO 1----------");
        System.out.println(est1.toString());

        //OBJETO 2
        Universidad uni2 = new Universidad("UNL", "Argelia");
        Estudiante est2 = new Estudiante("Santiago Mendieta", 9.3, 7.9, uni2);
        est2.calcularPromedio();
        System.out.println("----------OBJETO 2----------");
        System.out.println(est2.toString());

    }

}
