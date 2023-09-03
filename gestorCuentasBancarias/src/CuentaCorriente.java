public class CuentaCorriente extends CuentaBancaria {
    private double comision;

    public CuentaCorriente(int numero, double saldo, String titular, double comision) {
        super(numero, saldo, titular);
        this.comision = comision;
    }

    public void calcularIntereses() {
        // Las cuentas corrientes no tienen intereses
    }

    public void cobrarComision() {
        double comisionCobrada = comision;
        realizarTransaccion(-comisionCobrada);
        System.out.println("Comisión cobrada: " + comisionCobrada);
    }
}
