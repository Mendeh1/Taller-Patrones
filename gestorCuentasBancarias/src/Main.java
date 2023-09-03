import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear un mapa de prototipos de cuentas bancarias
        Map<String, CuentaBancaria> prototipos = new HashMap<>();
        prototipos.put("CuentaAhorro", new CuentaAhorro(1, 1000.0, "Juan", 0.05));
        prototipos.put("CuentaCorriente", new CuentaCorriente(2, 2000.0, "Maria", 10.0));

        // Clonar cuentas y personalizarlas
        CuentaBancaria cuenta1 = prototipos.get("CuentaAhorro").clone();
        cuenta1.calcularIntereses();
        cuenta1.mostrarInformacion();

        CuentaBancaria cuenta2 = prototipos.get("CuentaCorriente").clone();
        cuenta2.cobrarComision();
        cuenta2.mostrarInformacion();
    }
}
