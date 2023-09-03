public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(int numero, double saldo, String titular, double tasaInteres) {
        super(numero, saldo, titular);
        this.tasaInteres = tasaInteres;
    }

    public void calcularIntereses() {
        double intereses = obtenerSaldo() * tasaInteres;
        realizarTransaccion(intereses);
        System.out.println("Intereses calculados: " + intereses);
    }

    public void cobrarComision() {
        // Las cuentas de ahorro no tienen comisiones
    }
}
