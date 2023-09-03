public class Main {
    public static void main(String[] args) {
        FabricaPersonaje fabrica = new FabricaPersonaje();

        Personaje guerrero = fabrica.crearPersonaje("guerrero");
        Habilidad ataqueEspada = fabrica.crearHabilidad("ataqueespada");

        Personaje mago = fabrica.crearPersonaje("mago");
        Habilidad lanzarHechizo = fabrica.crearHabilidad("lanzarhechizo");

        Personaje arquero = fabrica.crearPersonaje("arquero");
        Habilidad dispararFlecha = fabrica.crearHabilidad("dispararflecha");

        guerrero.mostrarInformacion();
        ataqueEspada.usar();

        mago.mostrarInformacion();
        lanzarHechizo.usar();

        arquero.mostrarInformacion();
        dispararFlecha.usar();
    }
}
