public class Revista extends Ejemplar{
    /**Variables.*/
    private String Nombre;
    private int CantArticulos;
    
    Generador g = new Generador();
    public Revista() {}
    
    public Revista(String Nombre, int CantArticulos, int codigo, int cantPaginas, String resumen, int añoPublicacion, Responsable responsable) {
     super(codigo,cantPaginas, resumen, añoPublicacion, responsable);
     this.setNombre(Nombre);
     this.setCantArticulos(CantArticulos);
    }

    /**Getters.*/
    public String getNombre(){return Nombre;}
    public int getCantArticulos(){return CantArticulos;}
    
     /**Setters.*/
    public void setNombre(String Nombre){this.Nombre = Nombre;}
    public void setCantArticulos(int CantArticulos){this.CantArticulos = CantArticulos;}

    /**To String.*/
    public String toString() {return (getNombre() + " " + g.getNroVolumen());}
    
    /** Concatenar Revista.*/
    public String informe() {return getNombre() + " Vol " + g.getNroVolumen();}

}