package POO.Herencia;

public class Estudiante extends Persona{
    private int codigoEstudiante;
    private double notafinal;

    public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, double notafinal) {
        super(nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notafinal = notafinal;
        // Auto-generated constructor stub
    }

    public void mostrarDatos () {
        System.out.println(" Nombre: " + getNombre() + 
                            "\n Apellido: " + getApellidos() + 
                            "\n Edad: " + getEdad() + 
                            "\n Codigo Estudiante: " + codigoEstudiante + 
                            "\n Nota final: " + notafinal);
    }
}
