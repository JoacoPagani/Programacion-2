public class Literatura extends Libro {
    private String genero;
    private boolean edBolsillo;
    
    /**Constructores.*/
    public Literatura() {}
    
    public Literatura(String genero, boolean edBolsillo,int ISBN, String nombre, int CantPaginas, double Precio, Fecha publicacion, Autor Autor) {
        super(ISBN, nombre,CantPaginas,Precio,publicacion,Autor);
        this.setGenero(genero);
        this.setEdBolsillo(edBolsillo);
    }
    
    /**Setters.*/
    public void setGenero(String g){genero = g;}
    public void setEdBolsillo(boolean eb) {edBolsillo = eb;}
    
    /**Getters.*/
    public String getGenero() {return genero;}
    public boolean getEdBolsillo() {return edBolsillo;}
    
    
    public double calcularPrecio() {
        double precio = super.getPrecio();
        if (getEdBolsillo()) {precio *= 0.85;}
        
        if (getGenero().equalsIgnoreCase("cuento") || getGenero().equalsIgnoreCase("novela") ){
            precio *= 0.95;
        }
        return precio;
    }
}