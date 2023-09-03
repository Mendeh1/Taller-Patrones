public class Hamburguesa implements Comida {
    @Override
    public String mostrarDescripcion() {
        return "Hamburguesa: carne, lechuga, tomate, queso";
    }

    @Override
    public double calcularPrecio() {
        return 7.99;
    }
}