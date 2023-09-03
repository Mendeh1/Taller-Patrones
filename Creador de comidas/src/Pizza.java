public class Pizza implements Comida {
    @Override
    public String mostrarDescripcion() {
        return "Pizza: salsa de tomate, queso, pepperoni";
    }

    @Override
    public double calcularPrecio() {
        return 9.99;
    }
}
