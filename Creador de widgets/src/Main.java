public class Main {
    public static void main(String[] args) {
        FabricaWidget fabrica = new FabricaWidget();

        Widget boton = fabrica.crearWidget("boton");
        Widget campotexto = fabrica.crearWidget("campotexto");
        Widget panel = fabrica.crearWidget("panel");

        boton.dibujar();
        boton.clic();

        campotexto.dibujar();
        campotexto.clic();

        panel.dibujar();
        panel.clic();
    }
}

