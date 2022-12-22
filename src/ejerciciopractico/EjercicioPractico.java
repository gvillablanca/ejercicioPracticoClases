package ejerciciopractico;

import clasesEjercicioPractico.ClaseA;
import funcionesEjercicioPractico.funciones;
import java.util.ArrayList;

public class EjercicioPractico {
    public static void main(String[] args) {
               
        ArrayList<ClaseA> comunidad = new ArrayList<>();
        
        ClaseA persona1 = new ClaseA();
        persona1.setNombre("raquel");
        comunidad.add(persona1);
        
        ClaseA persona2 = new ClaseA();
        persona2.setNombre("maria");
        comunidad.add(persona2);
        
        System.out.println(comunidad);
        
        
        funciones.menu(comunidad);
    }    
}
