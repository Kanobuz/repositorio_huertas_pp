package programas;

/**
 * @author Huertas Quiroz Elver Said Ney
 */
import java.util.Scanner;

public class SueldoEmpleado {
    public static void main(String args[]) {
        // Declaración de Variables
        String empleado;
        double sueldoBruto, horasTrabajadas, tarifaHora, descuento, sueldoNeto;
        
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de Datos
        System.out.print("Nombre de empleado: ");
        empleado = lectura.next();
        System.out.print("Horas trabajadas: ");
        horasTrabajadas = lectura.nextDouble();
        System.out.print("Tarifa por Hora: ");
        tarifaHora = lectura.nextDouble();
        
        // Proceso de Datos
        sueldoBruto = horasTrabajadas * tarifaHora;
        descuento = sueldoBruto * 0.13;
        sueldoNeto = sueldoBruto - descuento;
        
        // Salida de Datos
        System.out.println("Resultados" + sueldoBruto); // Agregado
        System.out.println("Sueldo Bruto: " + sueldoBruto);
        System.out.println("Descuento: " + descuento);
        System.out.println("Sueldo Neto: " + sueldoNeto);
        
    }
}
