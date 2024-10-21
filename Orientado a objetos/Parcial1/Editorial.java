public class Editorial {
    
    /**Variables.*/
    private String nombre;
    private int cantPremios;
    private Libro[] libros;
    private int dimF = 5;
    
    /**Constructores.*/    
    public Editorial() {}
    
    public Editorial(String nombre, int cantPremios, Libro[] libros) {
        this.setNombre(nombre);
        this.setCantPremios(cantPremios);
        this.setLibros(libros);
        
    }
    
    
    public void cargarVector() {}
    
    /**Getters.*/
    public String getNombre() {return nombre;}
    public int getCantPremios() {return cantPremios;}
    public Libro[] getLibros() {return libros;}
    
    /**Setters.*/
    public void setNombre(String n) {nombre = n;}
    public void setCantPremios(int cp) {cantPremios = cp;}
    public void setLibros(Libro[] l) {libros = l;}
}