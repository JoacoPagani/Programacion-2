import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un jugador con datos leídos desde teclado
        System.out.println("Ingrese los datos del jugador:");
        System.out.print("Nombre: ");
        String nombreJugador = sc.nextLine();
        System.out.print("DNI: ");
        int DNIJugador = sc.nextInt();
        System.out.print("Edad: ");
        int edadJugador = sc.nextInt();
        System.out.print("Sueldo básico: ");
        double sueldoBasicoJugador = sc.nextDouble();
        System.out.print("Cantidad de goles: ");
        int goles = sc.nextInt();
        System.out.print("Cantidad de partidos jugados: ");
        int partidosJugados = sc.nextInt();
        sc.nextLine();  // Limpiar buffer

        Jugador jugador = new Jugador(partidosJugados,  goles, DNIJugador, edadJugador, sueldoBasicoJugador,nombreJugador);
        

        System.out.println("\nIngrese los datos del entrenador:");
        System.out.print("Nombre: ");
        String nombreEntrenador = sc.nextLine();
        System.out.print("DNI: ");
        int DNIEntrenador = sc.nextInt();
        System.out.print("Edad: ");
        int edadEntrenador = sc.nextInt();
        System.out.print("Sueldo básico: ");
        double sueldoBasicoEntrenador = sc.nextDouble();
        System.out.print("Cantidad de campeonatos ganados: ");
        int campeonatosGanados = sc.nextInt();
        sc.nextLine();  // Limpiar buffer

        Entrenador entrenador = new Entrenador(campeonatosGanados,DNIEntrenador, edadJugador, sueldoBasicoEntrenador,nombreEntrenador);

        // Mostrar la información de ambos objetos usando el método toString
        System.out.println("\nDatos del jugador:");
        System.out.println(jugador.toString());
        System.out.println("\nDatos del entrenador:");
        System.out.println(entrenador.toString());

        sc.close();  // Cerrar el scanner
    }
}
