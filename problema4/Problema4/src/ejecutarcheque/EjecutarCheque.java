package ejecutarcheque;

public class EjecutarCheque {

    public static void main(String[] args) {

        // OBJETO 1
        Cliente cli1 = new Cliente("Bryan Carlos", "Alao Carrillo", "0549586547");
        Banco ban1 = new Banco("Banco del Pacfico", 4);
        Cheque cheq1 = new Cheque(cli1, ban1, 500.20);
        cheq1.calcularComisionBanco();
        System.out.println("----------OBJETO 1----------");
        System.out.println(cheq1.toString());

        // OBJETO 2
        Cliente cli2 = new Cliente("Marco Santiago", "Herrera Mendieta", "1104963812");
        Banco ban2 = new Banco("Banco Guayaquil", 7);
        Cheque cheq2 = new Cheque(cli2, ban2);
        cheq2.calcularComisionBanco();
        System.out.println("----------OBJETO 2----------");
        System.out.println(cheq2.toString());
    }

}
