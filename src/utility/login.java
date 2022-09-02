package utility;

import java.util.Scanner;

public class login {
    public void iniciaSeccion() {
        String us = "profe", pass = "1234";
        String us1 = "david", pass1 = "2019";
        String user, password;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println();
            String conMasyu = us.toUpperCase();
            System.out.print("Introduzca un usuario: ");
            user = teclado.nextLine();
            
            System.out.print("Introduzca su contraseña: ");
            password = teclado.nextLine();
            
            int intentos = 0;
            
            if (us.equals(user) && pass.equals(password)) {
                System.out.print("\033[33m :: Bienvenido " + conMasyu);
            }
            
            while (pass.equals(password)==false && (intentos < 3)) {
                int inteT = intentos + 1;
                System.out.println("Error de usuario y contraseña");
                System.out.println("Nro de intentos: " + inteT);

                System.out.println("Introduzca su usuario: ");
                user = teclado.nextLine();
                
                System.out.println("Introduzca su contrasña: ");
                password = teclado.nextLine();

                intentos++;
            }

            if (intentos==3) {
                System.out.println("\033[31m Lo sentimos usuario y clase son incorrectos..!");
            }

            System.out.println("");
	    }
    }
}
