public class Ensalada implements Comida {
    @Override
    public String mostrarDescripcion() {
        return "Ensalada: lechuga, tomate, pepino, aderezo";
    }

    @Override
    public double calcularPrecio() {
        return 5.99;
    }
}
