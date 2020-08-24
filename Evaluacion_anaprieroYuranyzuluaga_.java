/*
Hacer un algoritmo que lea el número de empleados de una empresa y 
el salario básico mensual (todos ganan lo mismo) y luego calcule el valor 
de la nómina si a cada uno se le deduce el 8% del salario básico mensual 
por prestaciones mensuales y se les da un auxilio de transporte de 97700.
(codificar el ejercicio)

 */
package evaluacion_anapriero.yuranyzuluaga_;
import java.util.Scanner;

public class Evaluacion_anaprieroYuranyzuluaga_ {

   
    public static void main(String[] args) {
        //definicion de variables
        int Num_empleados,Auxilio_trans;
        double S_Basico,valor_nomina,Valor_nomina_bruto,Ded;
        Scanner oleer=new Scanner(System.in);
        
        //lectura de datos
        System.out.println("Ingrese el numero de empleados");
        Num_empleados=oleer.nextInt();
        
        System.out.println("Ingrese el salario");
        S_Basico=oleer.nextDouble();
        
        //operacion
        Valor_nomina_bruto=S_Basico*Num_empleados;
        Ded= Valor_nomina_bruto*0.08;
        Auxilio_trans=Num_empleados*97700;
        valor_nomina=(Valor_nomina_bruto - Ded)+Auxilio_trans;
        //muestre 
        System.out.println("la nomina es: "+valor_nomina);


    }
    
}
