public class Main {
    public static void main(String[] args) {
        FabricaComida fabrica = new FabricaComida();

        Comida hamburguesa = fabrica.crearHamburguesa();
        System.out.println("Descripción: " + hamburguesa.mostrarDescripcion());
        System.out.println("Precio: $" + hamburguesa.calcularPrecio());

        Comida pizza = fabrica.crearPizza();
        System.out.println("Descripción: " + pizza.mostrarDescripcion());
        System.out.println("Precio: $" + pizza.calcularPrecio());

        Comida ensalada = fabrica.crearEnsalada();
        System.out.println("Descripción: " + ensalada.mostrarDescripcion());
        System.out.println("Precio: $" + ensalada.calcularPrecio());
    }
}
