package POO.Asociaciones.Asoci11;

public class Pelota {
    private String marca;
    private String modelo;

    
    Futbolista futbolista;
    public String getModelo;
    
    //! Constructor
    public Pelota(String marca, String modelo, Futbolista futbolista) {
        this.marca = marca;
        this.modelo = modelo;
        this.futbolista = futbolista;
        futbolista.setPelota(this);
    }
    
    public void presentarse() {
        System.out.println("Soy la pelota " + marca + " y de modelo " + modelo);
        futbolista.pelotear();
    }
    
    //! Modelo

    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
