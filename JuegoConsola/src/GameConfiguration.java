public class GameConfiguration {

    // Instancia única de la clase GameConfiguration
    private static GameConfiguration instance = null;

    // Propiedades privadas para almacenar la configuración
    private String dificultad;
    private int volumenSonido;
    private String opcionesGraficas;

    // Constructor privado para evitar la creación de instancias directamente
    private GameConfiguration() {
        // Inicializa la configuración con valores predeterminados
        dificultad = "Normal";
        volumenSonido = 50;
        opcionesGraficas = "Medio";
    }

    // Método estático para obtener la única instancia de la clase GameConfiguration
    public static GameConfiguration getInstance() {
        if (instance == null) {
            instance = new GameConfiguration();
        }
        return instance;
    }

    // Métodos públicos para establecer y obtener los valores de dificultad, volumen de sonido y opciones gráficas

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getVolumenSonido() {
        return volumenSonido;
    }

    public void setVolumenSonido(int volumenSonido) {
        if (volumenSonido >= 0 && volumenSonido <= 100) {
            this.volumenSonido = volumenSonido;
        }
    }

    public String getOpcionesGraficas() {
        return opcionesGraficas;
    }

    public void setOpcionesGraficas(String opcionesGraficas) {
        this.opcionesGraficas = opcionesGraficas;
    }
}

