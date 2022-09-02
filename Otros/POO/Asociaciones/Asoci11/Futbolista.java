package POO.Asociaciones.Asoci11;

public class Futbolista {
    private String nombre;
    private int edad;

    Pelota pelota;

    public Futbolista(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar () {
        System.out.println("Hola soy " + nombre + " y tengo " + edad + " anos.");
        pelota.presentarse();
    }

    public void pelotear () {
        System.out.println("Yo " + nombre + " estoy jugando con mi pelota " + pelota.getModelo());
    }

    public void setPelota (Pelota pelota) {
        this.pelota = pelota;
    }
}
