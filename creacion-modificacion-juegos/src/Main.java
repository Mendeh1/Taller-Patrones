public class Main {
    public static void main(String[] args) {
        Soldado soldadoOriginal = new Soldado("Soldado A", 10, 5);
        soldadoOriginal.mostrarDescripcion();
        soldadoOriginal.atacar();
        soldadoOriginal.defender();

        Soldado soldadoClonado = (Soldado) soldadoOriginal.clone();
        soldadoClonado.modificarAtaque(12);
        soldadoClonado.mostrarDescripcion();
        soldadoClonado.atacar();
        soldadoClonado.defender();

        Arquero arqueroOriginal = new Arquero("Arquero B", 8, 3);
        arqueroOriginal.mostrarDescripcion();
        arqueroOriginal.atacar();
        arqueroOriginal.defender();

        Arquero arqueroClonado = (Arquero) arqueroOriginal.clone();
        arqueroClonado.modificarDefensa(4);
        arqueroClonado.mostrarDescripcion();
        arqueroClonado.atacar();
        arqueroClonado.defender();
    }
}