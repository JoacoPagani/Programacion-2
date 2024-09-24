/* El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen (con
puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad de la
comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes para
cada uno de los aspectos y almacene la información en una estructura. Luego imprima
la calificación promedio obtenida por cada aspecto */
import java.util.Scanner;

public class MainEj8 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Restaurante rest = new Restaurante();
       double c;
       for (int i=0; i<4; i++) {
           for (int j=0; j<5; j++) {
               System.out.println("Seleccione la calificacion");
               c = in.nextDouble();
               rest.setCalificacion(i, j, c);
           }
        }
        rest.calcularPromedio();
    
    }
}     
  
