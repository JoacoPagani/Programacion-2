/*
 5- Realice un programa que cargue un vector con 10 strings leídos desde teclado. El vector
generado tiene un mensaje escondido que se forma a partir de la primera letra de cada string.
Muestre el mensaje escondido en consola.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dimF = 10;
        Decodificador decodificador = new Decodificador(dimF); // Vector de 10 palabras
        
        for (int i = 0; i < dimF; i++) {
            System.out.println("Ingrese una palabra:");
            String palabra = in.next();
            decodificador.setVectorPalabras(palabra, i);
        }// Carga las palabras
        
        String mensajeEscondido = decodificador.obtenerMensajeEscondido(); // Obtiene el mensaje escondido
        
        System.out.println("El mensaje escondido es: " + mensajeEscondido); // Muestra el mensaje
    }
}