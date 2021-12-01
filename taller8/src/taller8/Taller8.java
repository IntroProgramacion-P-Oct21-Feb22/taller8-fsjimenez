/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Taller8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombrePadre;
        String apellidoPadre;
        double sueldo = 0;
        double gastoSemanal1;
        double gastoSemanal2;
        double gastoSemanal3;
        int condicion; 
        double gastoHijos;
        String cadena = "";
        String cadena2 = "";
        boolean bandera = true;
        
        
        do{
        System.out.println("Ingrese el nombre del padre:");
        nombrePadre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido del padre");
        apellidoPadre = entrada.nextLine();
        
        System.out.println("Ingrese el sueldo del padre");
        sueldo = entrada.nextInt();
        
        System.out.println("Ingrese el gasto semanal del primer hijo:");
        gastoSemanal1 = entrada.nextDouble();
        
        System.out.println("Ingrese el gasto semanal del segundo hijo:");
        gastoSemanal2 = entrada.nextDouble();
        
        System.out.println("Ingrese el gasto semanal del tercer hijo:");
        gastoSemanal3 = entrada.nextDouble();
        
        gastoHijos = gastoSemanal1 + gastoSemanal2 + gastoSemanal3;
        
        if (gastoHijos<=sueldo){
        cadena2 = cadena2 + "El padre de familia" + nombrePadre + " " + apellidoPadre + 
                " le alcanza el " + "dinero";
        } else {
        cadena2 = cadena2 + "El padre de familia " + nombrePadre + " " + apellidoPadre 
                + " le falta el dinero";
        }
        
        cadena = String.format("Hijo1, Gasto semanal $%.2f\nHijo2, Gasto semanal $%.2f\n"
                + "Hijo3, Gasto semanal $%.2f\nTotal gasto en hijos: %.2f\n" 
                + "%s",                    
                    gastoSemanal1, 
                    gastoSemanal2,
                    gastoSemanal3,
                    gastoHijos,
                    cadena2);
        
        
        System.out.println("Ingrese '10' para terminar el proceso");
        entrada.nextLine();
        condicion = entrada.nextInt();
        
        if (condicion == 10) {
                bandera = false;
            }
   
        
        }while(bandera == true); 
        
        
        
        System.out.println(cadena);
        
        
        
        
    }
    
    
    
}
