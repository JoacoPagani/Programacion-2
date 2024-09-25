import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String nombre;
        int Dni; int edad;
        
        Scanner in = new Scanner(System.in);
        Persona joaquin = new Persona();
        
        System.out.println("Ingrese su nombre: ");
        nombre = in.nextLine();
        joaquin.setNombre(nombre);
        System.out.println("Ingrese su edad: ");
        edad = in.nextInt();
        joaquin.setEdad(edad);
        System.out.println("Ingrese su dni: ");
        Dni = in.nextInt();
        joaquin.setDNI(Dni);
        
        
        System.out.println(joaquin.toString());
    }
    
}