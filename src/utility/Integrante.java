package utility;

public abstract class Integrante {
    private int id;
    private String nombre;

    /**
     //! Constructor
     * @param id
     * @param nombre
     * @param edad
     */
    public Integrante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    //! Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //! Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
