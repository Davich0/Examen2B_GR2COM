public class consolaColor {
    
    // El metodo main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) {
        System.out.println("Colores");
        System.out.println(" \033[30m -> Negro");
        System.out.println(" \033[31m -> Rojo");
        System.out.println(" \033[32m -> Verde");
        System.out.println(" \033[33m -> Amarillo");
        System.out.println(" \033[34m -> Azul");
        System.out.println(" \033[35m -> Mangenta");
        System.out.println(" \033[36m -> Cyan");
        System.out.println(" \033[37m -> Blanco");
        System.out.println(" \u001B[0m -> Reset");
    } // Fin del método main
} // Fin de la clase App
