/**
 3- a) Modifique la clase Persona (del ejercicio 2 de la clase 2) para representar entrenadores de
un club de fútbol. Un entrenador se caracteriza por su nombre, sueldo básico y la cantidad de
campeonatos ganados.
▪ Defina métodos para obtener/modificar el valor de cada atributo.
▪ Defina el método calcularSueldoACobrar que calcula y devuelve el sueldo a cobrar por el
entrenador. El sueldo se compone del sueldo básico, al cual se le adiciona un plus por
campeonatos ganados (5000 pesos si ha ganado entre 1 y 4 campeonatos; 30.000 pesos si
ha ganado entre 5 y 10 campeonatos; 50.000 pesos si ha ganado más de 10 campeonatos).
b) Realizar un programa principal que instancie un entrenador, cargándole datos leídos desde
teclado. Pruebe el correcto funcionamiento de cada método implementado
 */

import java.util.Scanner;
public class Main {
    public static void Main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Entrenador entrenador = new Entrenador("Joaquin", 25000, 5);
        
        System.out.println("El sueldo a cobrar es: " + entrenador.calcularSueldoACobrar());
        
        
    }
}
