import java.util.Scanner;
public class ProgramaArba {
    
    public static void main(String[] args){
        //declaracion de variables
        int dimF = 1000;
        Vehiculo[] v = new Vehiculo[dimF];
        Scanner in = new Scanner(System.in);
        
        cargarVector(v, dimF, in);
        imprimirDatos(v,dimF);
        in.close();
        
        
        
    }
    
    public static void imprimirDatos(Vehiculo[] v, int DIMF){
        for(int i = 0; i<DIMF;i++){
            System.out.println("El monto a pagar por el vehiculo es: " + v[i].calcularTotal());
        }
    }
    
    public static void cargarVector(Vehiculo[] v, int dimF, Scanner in) {
        for (int i = 0; i < dimF; i++) {
            System.out.println("Ingrese los datos del Propietario");
            Propietario p = leerPropietario(in);
            System.out.println("Ingrese que vehiculo va a declarar si Automotor o Embarcacion");
            String tipo = in.next();
            if(tipo.equals("automotor")){
                cargarAutomotor(v,i,p, in);
            } else if(tipo.equals("embarcacion")){
                cargarEmbarcacion(v,i,p, in);
                } 
        }
    }
    
    public static Propietario leerPropietario(Scanner in) {
        System.out.println("Ingrese su CIT");
        int cit = in.nextInt();
        System.out.println("nombre");
        String nom = in.next();
        System.out.println("Apellido");
        String ape = in.next();
        Propietario p = new Propietario(nom,ape,cit);
        return p;
    };
    
    public static void cargarAutomotor(Vehiculo[] v, int i, Propietario p, Scanner in) {
         //Datos del vehiculo
        System.out.println("Ingrese el año del automotor");
        int año = in.nextInt();
        System.out.println("Ingrese el importe basico a pagar");
        int impB = in.nextInt();
        System.out.println("Ingrese la patente del automotor");
        String pat = in.next();
        System.out.println("Ingrese el importe adicional");
        int impA = in.nextInt();
        System.out.println("Ingrese una breve descripcion del vehiculo");
        String desc = in.next();
        //Cargo en el vector
        Automotor a = new Automotor(año,impB,p,pat,impA,desc);
        v[i] = a;
    }
    
    public static void cargarEmbarcacion(Vehiculo[] v, int i, Propietario p, Scanner in){
        
        System.out.println("Ingrese el año del embarcacion");
        int año = in.nextInt();
        System.out.println("Ingrese el importe basico a pagar");
        int impB = in.nextInt();
        System.out.println("Ingrese el codigo REY");
        int codRey = in.nextInt();
        System.out.println("Ingrese el nombre de la embarcacion");
        String nom = in.next();
        System.out.println("Ingrese el tipo de embarcacion");
        String tipo = in.next();
        System.out.println("Ingrese la eslora");
        int eslora = in.nextInt();
        System.out.println("Ingrese el peso del vehiculo");
        int peso = in.nextInt();
        System.out.println("Ingrese el precio del vehiculo");
        int precio = in.nextInt();
        
        Embarcacion e = new Embarcacion(año,p,impB,codRey,nom,tipo,eslora,peso,precio);
        v[i] = e;
    }
    
}