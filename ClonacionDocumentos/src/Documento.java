public abstract class Documento implements Cloneable {
    private String contenido;
    private String formato;

    public Documento(String contenido, String formato) {
        this.contenido = contenido;
        this.formato = formato;
    }

    public abstract Documento clone();

    public String mostrarContenido() {
        return contenido;
    }

    public String obtenerFormato() {
        return formato;
    }
}
