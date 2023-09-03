public class FabricaWidget {

    public Widget crearWidget(String tipo) {
        switch (tipo.toLowerCase()) {
            case "boton":
                return new Boton();
            case "campotexto":
                return new CampoTexto();
            case "panel":
                return new Panel();
            default:
                throw new IllegalArgumentException("Tipo de widget no válido: " + tipo);
        }
    }
}