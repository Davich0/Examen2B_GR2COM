package POO.Asociaciones.Asoci1M;

import java.util.HashSet;
import java.util.Iterator;

public class Jefe {
    //private String nombre;
    //private int dni;

    // HashSet son de coleacciones
    HashSet<Empleado> empleados = new HashSet<Empleado>();
    
    //! Constructor
    /*public Jefe(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }*/

    public void setEmpleado(Empleado empleado) {
        Iterator<Empleado> iterador = empleados.iterator();
        Empleado e = null;
        boolean encontrado = false;

        while (iterador.hasNext() && !encontrado) {
            e = iterador.next();
            if (e.getCodigo() == empleado.getCodigo()) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Empleado ya agregado anteriormente.");
        } else {
           // empleado.add(e);
            System.out.println("Empleado " + empleado.getNombre() + " ha sido contratado exisotamente.");
        }
    }
}
