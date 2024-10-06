/**
 4- a) Modifique la clase Persona (ya implementada en la clase 2) agregando los cambios
necesarios para que represente jugadores de fútbol de un club. Todos los jugadores de futbol
se caracterizan por tener además de los atributos de la clase persona una estadística básica
que consiste en el número de partidos jugados y el número de goles anotados.
▪ Incorpore los atributos número de partidos jugados y número de goles anotados junto a
todos sus getters y setters.
b) Implemente un programa para que se lean desde teclado y almacenen en un vector a lo
sumo 50 jugadores. Luego de almacenar la información, agregue un método que devuelva la
cantidad de jugadores con más de 100 partidos jugados.
 */

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int dimF = 50;
        int dimL;  // Inicializamos el número de jugadores cargados
        
        Jugador[] jugadores = new Jugador[dimF];
        
        // Llamamos al método para cargar jugadores
        dimL = CargarJugadores(jugadores, dimF);
        
        // Mostramos la cantidad de jugadores con más de 100 partidos jugados
        System.out.println("Cantidad de jugadores con más de 100 partidos jugados: " + contarJugadoresConMasDe100Partidos(jugadores, dimL));
    }

    public static int CargarJugadores(Jugador[] v, int dimF) {
        Scanner in = new Scanner(System.in);
        int dni;
        String nombre;
        int edad;
        int partidosJugados;
        int goles;
        int dimL = 0;
        System.out.println("Ingrese DNI del jugador (0 para finalizar): ");
        dni = in.nextInt();
        
        while (dni != 0 && dimL < dimF) {
            in.nextLine();  // Limpiar el buffer
            System.out.println("Ingrese nombre del jugador: ");
            nombre = in.nextLine();
            
            System.out.println("Ingrese edad del jugador: ");
            edad = in.nextInt();
            
            System.out.println("Ingrese cantidad de partidos jugados: ");
            partidosJugados = in.nextInt();
            
            System.out.println("Ingrese cantidad de goles anotados: ");
            goles = in.nextInt();
            
            // Creamos un nuevo objeto Jugador y lo agregamos al array
            Jugador p = new Jugador();
            p.setDNI(dni);
            p.setNombre(nombre);
            p.setEdad(edad);
            p.setPartidosJugados(partidosJugados);
            p.setGoles(goles);
            
            v[dimL] = p;
            dimL++;  // Aumentamos el número de jugadores cargados
            
            // Pedimos el siguiente DNI
            System.out.println("Ingrese DNI del siguiente jugador (0 para finalizar): ");
            dni = in.nextInt();
        }
        return dimL; //
    }
    
    public static int contarJugadoresConMasDe100Partidos(Jugador[] v, int dimL) {
        int contador = 0;
        for (int i = 0; i < dimL; i++) {
            System.out.println(v[i].getPartidosJugados());
            if (v[i].getPartidosJugados() > 100) {
                System.out.println("---");
                contador++;
            }
        }
        return contador;
    }
}
