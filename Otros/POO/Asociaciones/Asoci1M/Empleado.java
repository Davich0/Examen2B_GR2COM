package POO.Asociaciones.Asoci1M;

public class Empleado {
    private String nombre;
    //private double sueldo;
    private int codigo;
    
    
    Jefe jefe;
    
    /*public Empleado(String nombre, double sueldo, Jefe jefe) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.jefe = jefe;
        Jefe.setEmpleado(this);
    }*/
    
    //! Codigo
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //! Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
