/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programas;
import java.util.Scanner;
/**
 *
 * @author perseus
 */
public class Programa01 {

    
    public static void main(String[] args) {
        // TODO code application logic here
          // TODO code application logic here
       
        // void solo ejecuta un bloque de codigo no retorna valores
        
        //Declaracion de variales
        String empleado;
        double ingreso, gasto, ahorrom, ahorroa;
        //creando el objeto lectura
        Scanner lectura= new Scanner(System.in);
        //Entada de datos
        System.out.print("Nombre de empleado: ");
        empleado=lectura.next();
        System.out.print("Ingresos del empleado: ");
        ingreso=lectura.nextDouble();
        System.out.print("Gastos del empleado: ");
        gasto=lectura.nextDouble();
        //Proceso de datos
        ahorrom=ingreso-gasto;
        ahorroa=ahorrom*12;
        //Salida de datos
        System.out.println("Ahorro Mensual: "+ahorrom);
        System.out.println("Ahorro Anual: "+ahorroa);
        //fin de las instrucciones/programa
    }
    
}
