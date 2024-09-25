import java.util.Scanner;

public class Main{
    public static void Main(String[] args) {
        int dimF = 2;
        Partido vector[] = cargarPartidos(dimF);
        
        System.out.println("La cantidad de partidos que ganor River: " + PartidosGanados("River", vector, dimF));
        System.out.println("El total de goles que hizo boca fue: " + cantidadGoles("Boca", vector, dimF));
        System.out.println("El porcentaje de empates fue: " + porcentajeEmpate( vector, dimF));
        
        
    }
    
    public static Partido[] cargarPartidos(int dimF) {
        Scanner in = new Scanner(System.in);
        Partido vector[] = new Partido[dimF];
        for (int i = 0; i < dimF; i++) {
            System.out.println("Ingrese el equipo local: ");
            String EquipoL = in.next();
            System.out.println("Ingrese la cantidad de goles que marco: ");
            int golL = in.nextInt();
            System.out.println("Ingrese el equipo visitante: ");
            String EquipoV = in.next();
            System.out.println("Ingrese la cantidad de goles que marco: ");
            int golV = in.nextInt();
            vector[i] = new Partido(EquipoL,EquipoV,golL,golV);
            
        }
        return vector;
    }
    
    public static int PartidosGanados(String Equipo,Partido v[], int dimF){
        int cont = 0;
        for (int i = 0; i < dimF; i++) {
            if (v[i].getGanador().equals(Equipo)) {
               cont++;     
            } 
        }
        return cont;
    }
    
    public static int cantidadGoles(String Equipo, Partido v[], int dimF){
        int cont = 0;
        for (int i = 0; i < dimF; i++) {
            if (v[i].getLocal().equals(Equipo)) {
                cont += v[i].getGolesLocal();   
            }
        }
        return cont;
    
    }
    
    public static double porcentajeEmpate(Partido v[], int dimF) {
        int suma = 0; double porcentaje;
        for (int i = 0; i < dimF; i++) {
            if (v[i].hayEmpate()) {
             suma ++;
            }
        }
        porcentaje = 100*(suma / dimF);
        return porcentaje;
    }
}