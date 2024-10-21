import java.util.Scanner;
public class ProgramaEditorial {

    
    public static void main(String[] args) {
        int dimF = 1000;
        int dimL = 0;
        Ejemplar[] v = new Ejemplar[dimF];
        Scanner in = new Scanner(System.in);
        cargarEjemplar(v,dimL,dimF, in);
        for(int i = 0; i < dimF; i++){
            System.out.println(v[i].informe());
        }
        in.close();
    }
    
    public static void LeerResponsable() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre del autor");
        String nombre = in.next();
        System.out.println("Ingrese el apellido"); 
        String Apellido = in.next();
        System.out.println("Ingrese el dni del autor");
        int dni = in.nextInt();
        Responsable r = new Responsable(dni,nombre,Apellido);
        return a;
    }
    
    public static void cargarEjemplar(Ejemplar[] v, int dimL, int dimF, Scanner in) {
         String ingresarOtro = "si";   
        
         while (ingresarOtro.equalsIgnoreCase("si")){
            System.out.println("Desea ingresar un libro o una revista?");
            String queEs = in.next();
            if (queEs.equalsIgnoreCase("revista")) {
                cargarRevista(v, dimL);
            } else { cargarLibro(v, dimL);}
            dimL++;
            System.out.println("Desea ingresar otro libro si/no");
            ingresarOtro = in.next();            
        }
    }
}