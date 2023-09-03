public class Arquero implements Unidad {
    private String nombre;
    private int ataque;
    private int defensa;

    public Arquero(String nombre, int ataque, int defensa) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void mostrarDescripcion() {
        System.out.println("Arquero: " + nombre);
    }

    public void atacar() {
        System.out.println(nombre + " dispara con " + ataque + " de precisión.");
    }

    public void defender() {
        System.out.println(nombre + " defiende con " + defensa + " de defensa.");
    }

    public Unidad clone() {
        return new Arquero(nombre, ataque, defensa);
    }

    public void modificarAtaque(int nuevoAtaque) {
        this.ataque = nuevoAtaque;
    }

    public void modificarDefensa(int nuevaDefensa) {
        this.defensa = nuevaDefensa;
    }
}
