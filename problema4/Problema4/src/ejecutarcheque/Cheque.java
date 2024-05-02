package ejecutarcheque;

public class Cheque {

    private Cliente cli;
    private Banco ban;
    private double valorCheque, comisionBanco;

    public Cheque(Cliente cli, Banco ban, double valorCheque) {
        this.cli = cli;
        this.ban = ban;
        this.valorCheque = valorCheque;
    }

    public Cheque(Cliente cli, Banco ban) {
        this.cli = cli;
        this.ban = ban;
        valorCheque = 742.38;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Banco getBan() {
        return ban;
    }

    public void setBan(Banco ban) {
        this.ban = ban;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.00003;
    }

    @Override
    public String toString() {
        return "CHEQUE\n"
                + "Valor del cheque: " + valorCheque + "\n"
                + "Comision del banco: " + comisionBanco + "\n"
                + "CLIENTE\n"
                + "Nombres: " + getCli().getNombres() + "\n"
                + "Apellidos: " + getCli().getApellidos() + "\n"
                + "Cédula: " + getCli().getCedula() + "\n"
                + "BANCO\n"
                + "Nombre: " + getBan().getNombre() + "\n"
                + "Número de sucursales: " + getBan().getNroSucursales() + "\n";
    }

}
