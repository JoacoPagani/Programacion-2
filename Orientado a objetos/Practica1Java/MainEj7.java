/*
Escriba un programa que simule el ingreso de personas a un banco. Cada persona
que ingresa indica la operación que desea realizar (0: “cobro de cheque” 1: “depósito/
extracción en cuenta” 2: “pago de impuestos o servicios” 3: “cobro de jubilación” 4:
“cobro de planes”). La recepción de personas culmina cuando un empleado ingresa la
operación 999 (cierre del banco). Informar la cantidad de personas atendidas por cada
operación y la operación más solicitada.  */

import java.util.Scanner;

public class MainEj7 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Banco banco = new Banco();
       int op;
       System.out.println("Ingrese la operación (0-4) o 999 para cerrar el banco:");
       op = in.nextInt();
       banco.setOperacion(op);
       while (op != 999) {
           
            banco.procesarOperacion(); // Se procesa la operación
            
            if (op == 999) {
                System.out.println("Banco cerrado.");
                break; // Cierra la recepción de personas
            }             
            System.out.println("Ingrese la operación (0-4) o 999 para cerrar el banco:");
            op = in.nextInt();
            banco.setOperacion(op);
        }
       
       banco.mostrarResultados(); 
        
   }
}