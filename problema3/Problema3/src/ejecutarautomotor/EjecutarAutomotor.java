package ejecutarautomotor;

public class EjecutarAutomotor {

    public static void main(String[] args) {

        // OBJETO 1
        Fabricante fab1 = new Fabricante("Honda", "Hamamatsu");
        Automotor auto1 = new Automotor("1196823475", 1996, 19000, fab1);
        auto1.calcularValorMatricula();
        System.out.println("----------OBJETO 1----------");
        System.out.println(auto1.toString());

        // OBJETO 2
        Fabricante fab2 = new Fabricante("Tesla", "California");
        Automotor auto2 = new Automotor("0984752374", 2019, fab2);
        auto2.calcularValorMatricula();
        System.out.println("----------OBJETO 2----------");
        System.out.println(auto2.toString());

    }

}
