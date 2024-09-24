import java.util.Scanner;

public class MainEj2 {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese la patente del auto");
        int p = sc.nextInt();
        
        
        //Creo el objeto patente
        Patente patente = new Patente(p);
        
        if (patente.esPar()){
        System.out.println("El auto tiene permitido el ingreso");
        } else {
            System.out.println("El auto no puede ingresar");
        }
    }
        
    
    
}

