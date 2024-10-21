public class Main {
    public static void Main(String[] args) {
        // Asegúrate de que 'Centro' es la clase correcta y tiene un constructor adecuado
        CentroEstadistica centro = new CentroEstadistica();
        
        Carrera c = new Carrera("hungria");
        
        Piloto p1 = new Clasificado(60, "1", "1", 1);
        c.cargarVector(p1);
        Piloto p2 = new Clasificado(61, "2", "2", 2);
        c.cargarVector(p2);
        Piloto p3 = new Clasificado(62, "3", "3", 3);
        c.cargarVector(p3);
        Piloto p4 = new Clasificado(63, "4", "4", 4);
        c.cargarVector(p4);
        Piloto p5 = new Clasificado(64, "5", "5", 5);
        c.cargarVector(p5);
        Piloto p6 = new Noclasificado("6", "6", 6);
        c.cargarVector(p6);
        
        System.out.print(centro);
        System.out.print(centro.obtenerPuntaje());    
    }
}
