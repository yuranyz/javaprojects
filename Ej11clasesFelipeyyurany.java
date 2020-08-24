/*
Ej 11 Clases: Elaborar una clase con funciones para hallar el valor bruto, el descuento y el valor neto a pagar por
un cliente si los datos de entrada son la cantidad de peliculas y el valor de peliculas prestadas en una 
tienda de video, el descuento se calcula dependiendo de la cantidad de peliculas prestadas asi: es del 10% 
sobre el valor bruto si llevo mas de 5 peliculas y no se le da descuento si lleva menos de 5 peliculas. Hacer
el formulario correspondiente para instanciar la clase y mostrar su funcionamiento.
*/
package ej11clasesfelipeyyurany;
import java.util.Scanner;

public class Ej11clasesFelipeyyurany {
    public static void main(String[] args){
        Scanner ent= new Scanner(System.in);
        //definimos variables
        int q, value;
        //ingrese cantidad peliculas y valor
        System.out.println("Ingrese la cantidad de peliculas: ");
        q= ent.nextInt();
        System.out.println("Ingrese el valor por pelicula: ");
        value= ent.nextInt();
        System.out.println(total(q, value));
        ent.close();
    }
//Calcular el valor bruto, generar el descuento segun la regla, entregar valor total
    public static String total(int cant, int val){
        return ("El valor bruto es de de: $"+bruto(cant, val)+", el descuento es de: "+(100-desc(cant)*100)+"%. \nEntonces el valor total es de: $"+calc(bruto(cant, val), desc(cant)));
    }

    public static double desc(int cant){
        if (cant>5){
             return 0.9;
        }
        else{
            return 1;
        }
    }

    public static int bruto(int cant, int valor){
        return cant*valor;
    }

    public static double calc(int bruto, double desc){
        return bruto*desc;
    }
}
