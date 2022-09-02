package utility;

public class Menu {
    int opc;

    public Menu(int opc) {
        this.opc = opc;
    }

    public void mostrarMenu() {
        System.out.println(" ---- MENU PRINCIPAL ---- ");
        System.out.println("1. Agregar amigo");
        System.out.println("2. Agregar amigo de amigo");
        System.out.println("3. Mostrar NETWORK");
        System.out.println("4. Salir");
        do {
            switch (opc) {
                case 1:
                    System.out.println(" Primero ");

                    break;
                case 2:
                    System.out.println(" Segundo");

                    break;
                case 3:
                    System.out.println(" Tercero");

                    break;  
                case 0:
                    System.out.println(" Salir");

                    break;  
                default:
                    break;
            }
        } while (opc==0 );
        
    }

    public void opcMenu(){
        String tema = "";
        String us = "profe";
            System.out.println();
            String conMasyu = us.toUpperCase();

            System.out.println(" ---------------------------");
            System.out.println("       NETWORKING DE " + tema   );
            System.out.println(" ---------------------------");
            System.out.println(" Usuario: " + conMasyu);
            mostrarMenu();
            System.out.println();
            System.out.println("Ingresa la opcion: " + opc);
    }
}
