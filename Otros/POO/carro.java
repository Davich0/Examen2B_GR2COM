package POO;

public class carro extends vehiculo{
    private String moNombre = "Mustang";
    public static void main(String[] args) {

        carro miCarro = new carro();

        miCarro.honk();

        System.out.println(miCarro + " " + miCarro.moNombre);
    }
}
