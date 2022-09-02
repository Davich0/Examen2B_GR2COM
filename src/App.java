import utility.*;

public class App {
    //private String user;
    //private String tema;
    public static void main(String[] args) throws Exception {
        System.out.println();
        login user = new login();
        user.iniciaSeccion();

        Menu opciones = new Menu(1);
        opciones.opcMenu();
        System.out.println("Espere");
    }   
}

/*
 ** Clave y contraseña en consola
 ** Colores en el texto
 ** UML
 ** Interfase, herencia https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-class-diagram-tutorial/
 ** Limpiador de pantalla
 ** Try-catch
 * Recursividad
*/