public class FabricaComida {

    public Comida crearHamburguesa() {
        return new Hamburguesa();
    }

    public Comida crearPizza() {
        return new Pizza();
    }

    public Comida crearEnsalada() {
        return new Ensalada();
    }
}