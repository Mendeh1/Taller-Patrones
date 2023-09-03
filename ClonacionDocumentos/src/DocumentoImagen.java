public class DocumentoImagen extends Documento {
    public DocumentoImagen(String contenido) {
        super(contenido, "Imagen");
    }

    @Override
    public DocumentoImagen clone() {
        return new DocumentoImagen(super.mostrarContenido());
    }
}