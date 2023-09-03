public class Main {
    public static void main(String[] args) {
        DocumentoTexto documentoTexto = new DocumentoTexto("Este es un documento de texto.");
        DocumentoTexto clonTexto = documentoTexto.clone();

        DocumentoImagen documentoImagen = new DocumentoImagen("Imagen de un paisaje.");
        DocumentoImagen clonImagen = documentoImagen.clone();

        System.out.println("Contenido del documento de texto original: " + documentoTexto.mostrarContenido());
        System.out.println("Formato del documento de texto original: " + documentoTexto.obtenerFormato());

        System.out.println("Contenido del documento de texto clonado: " + clonTexto.mostrarContenido());
        System.out.println("Formato del documento de texto clonado: " + clonTexto.obtenerFormato());

        System.out.println("Contenido del documento de imagen original: " + documentoImagen.mostrarContenido());
        System.out.println("Formato del documento de imagen original: " + documentoImagen.obtenerFormato());

        System.out.println("Contenido del documento de imagen clonado: " + clonImagen.mostrarContenido());
        System.out.println("Formato del documento de imagen clonado: " + clonImagen.obtenerFormato());
    }
}

