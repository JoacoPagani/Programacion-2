import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el micro con los datos especificados
        micro micro1 = new micro("ABC123", "Mar del Plata", 5); // 5 es la hora de salida, que representa "5:00 am"
        
        Scanner sc = new Scanner(System.in);
        int nroAsiento = 0;
        
        // Loop para ingresar asientos, finaliza con -1 o cuando el micro esté lleno
        while (nroAsiento != -1 && !micro1.microLleno()) {
            System.out.println("Ingrese el número de asiento que desea (1-20) o -1 para finalizar:");
            nroAsiento = sc.nextInt();
            
            if (nroAsiento == -1) {
                break; // Si se ingresa -1, se corta el bucle
            }

            // Validar el número del asiento
            if (micro1.validarAsiento(nroAsiento)) {
                // Intentar ocupar el asiento
                String resultado = micro1.ocuparAsiento(nroAsiento);
                System.out.println(resultado);
                
                // Si no se pudo ocupar porque está ocupado, mostrar el primer asiento libre
                if (resultado.equalsIgnoreCase("El asiento se encuentra ocupado")) {
                    int primerLibre = micro1.primerAsientoLibre();
                    System.out.println("El primer asiento libre es el número: " + primerLibre);
                }
            } else {
                System.out.println("Número de asiento inválido, ingrese un número entre 1 y 20.");
            }
        }
        
        // Al finalizar, informar la cantidad de asientos ocupados
        System.out.println("La cantidad de asientos ocupados es: " + micro1.asientosOcupados());
        
        sc.close(); // Cerrar el Scanner
    }
}
