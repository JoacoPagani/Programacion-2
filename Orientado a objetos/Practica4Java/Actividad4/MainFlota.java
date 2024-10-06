import java.util.Scanner;

public class MainFlota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Crear una flota vacía
        FlotaMicro flota = new FlotaMicro();
        
        // Cargar micros en la flota (hasta que se ingrese la patente "ZZZ000" o hasta que se complete la flota)
        String patente;
        while (!flota.estaCompleta()) {
            System.out.println("Ingrese la patente del micro (ZZZ000 para finalizar):");
            patente = sc.nextLine();
            
            if (patente.equalsIgnoreCase("ZZZ000")) {
                break; // Finaliza la carga si se ingresa "ZZZ000"
            }
            
            System.out.println("Ingrese el destino del micro:");
            String destino = sc.nextLine();
            
            System.out.println("Ingrese la hora de salida del micro:");
            int hora = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            
            // Crear un nuevo micro con los datos ingresados
            micro nuevoMicro = new micro(patente, destino, hora);
            
            // Intentar agregar el micro a la flota
            if (flota.agregarMicro(nuevoMicro)) {
                System.out.println("Micro agregado exitosamente.");
            } else {
                System.out.println("No se pudo agregar el micro, la flota está completa.");
            }
        }
        
        // Buscar y eliminar micro por patente
        System.out.println("Ingrese la patente de un micro para eliminarlo de la flota:");
        String patenteBuscar = sc.nextLine();
        
        // Buscar el micro en la flota
        if (flota.eliminarMicro(patenteBuscar)) {
            System.out.println("Micro con patente " + patenteBuscar + " eliminado de la flota.");
        } else {
            System.out.println("No se encontró un micro con la patente " + patenteBuscar + ".");
        }
        
        // Buscar micro por destino
        System.out.println("Ingrese el destino para buscar un micro:");
        String destinoBuscar = sc.nextLine();
        
        micro microDestino = flota.buscarMicroPorDestino(destinoBuscar);
        if (microDestino != null) {
            System.out.println("El micro que va a " + destinoBuscar + " tiene la patente: " + microDestino.getPatente() +
                               " y sale a las " + microDestino.getHoraSalida() + ":00 hs.");
        } else {
            System.out.println("No se encontró un micro con destino a " + destinoBuscar + ".");
        }
        
        sc.close(); // Cerrar el Scanner
    }
}
