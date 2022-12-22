package funcionesEjercicioPractico;

import clasesEjercicioPractico.ClaseA;
import java.util.ArrayList;
import java.util.Scanner;

public class funciones {
    
    public static void menu(ArrayList<ClaseA> comunidad){
        System.out.println("*********************************************************************");
        System.out.println("1- opcion1 \n2- opcion2 \n3- opcion3");
        System.out.println("*********************************************************************");
        
        String opcion = new String();        
        
        while(opcion.isEmpty()){
            System.out.println("Opcion: ");
            Scanner op = new Scanner(System.in);
            opcion = (op.nextLine()).trim(); 

            if(opcion.isEmpty()){
                System.out.println("Favor seleccionar una opcion: \n");
            }
            else if(opcion.equals("1")){
                leerComunidad(comunidad);
            }
            else if(opcion.equals("2")){
                leerComunidad(leerComunidadArreglo(comunidad));
            }
            else if(opcion.equals("3")){
                llenarComunidad(comunidad);
            }
            else{
                System.out.println("Opcion Invalida");
                opcion = new String();
            }
        }
    }
    
    public static void leerComunidad(ArrayList<ClaseA> comunidad){
        System.out.println(comunidad);
        funciones.menu(comunidad);
    }   
    
    public static ArrayList<ClaseA> leerComunidadArreglo(ArrayList<ClaseA> comunidad){
        return comunidad;
    }
    
    public static void llenarComunidad(ArrayList<ClaseA> comunidad){
        String nombrePersona = new String();
        System.out.println("Nombre persona: ");
        Scanner nombrePersonaIn = new Scanner(System.in);
        nombrePersona = nombrePersonaIn.nextLine();
        
        ClaseA persona = new ClaseA();
         
        for(int i = 0; i <= comunidad.size(); i++){
            if(comunidad.size() > 0){
                if(comunidad.get(i).getNombre().equals(nombrePersona)){
                    System.out.println("persona ya existe en esta comunidad");
                    break;
                }
                else{
                    persona.setNombre(nombrePersona);
                    comunidad.add(persona);
                    break;
                }
            }else{
                persona.setNombre(nombrePersona);
                comunidad.add(persona);
                break;
            }
        }
        
        System.out.println(comunidad);
        funciones.menu(comunidad);
    }
     
}
