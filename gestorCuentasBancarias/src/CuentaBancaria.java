
public abstract class CuentaBancaria implements Cloneable {
    private int numero;
    private double saldo;
    private String titular;

    public CuentaBancaria(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int obtenerNumero() {
        return numero;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void realizarTransaccion(double monto) {
        saldo += monto;
    }

    // Método abstracto para calcular intereses o cobrar comisiones según el tipo de cuenta
    public abstract void calcularIntereses();

    public abstract void cobrarComision();

    // Método para clonar la cuenta
    public CuentaBancaria clone() {
        try {
            return (CuentaBancaria) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Número de cuenta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: " + saldo);
    }
}

