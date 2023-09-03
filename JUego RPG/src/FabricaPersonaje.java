public class FabricaPersonaje {

    public Personaje crearPersonaje(String tipo) {
        switch (tipo.toLowerCase()) {
            case "guerrero":
                return new Guerrero();
            case "mago":
                return new Mago();
            case "arquero":
                return new Arquero();
            default:
                throw new IllegalArgumentException("Tipo de personaje no válido: " + tipo);
        }
    }

    public Habilidad crearHabilidad(String tipo) {
        switch (tipo.toLowerCase()) {
            case "ataqueespada":
                return new AtaqueEspada();
            case "lanzarhechizo":
                return new LanzarHechizo();
            case "dispararflecha":
                return new DispararFlecha();
            default:
                throw new IllegalArgumentException("Tipo de habilidad no válido: " + tipo);
        }
    }
}