public class Divulgativo extends Libro {
    /**Variables.*/
    String tipo;
    
    /**Constructores.*/
    public Divulgativo() {}
    
    public Divulgativo(String tipo, int ISBN, String nombre, int CantPaginas, double Precio, Fecha publicacion, Autor Autor) {
        super(ISBN,nombre, CantPaginas, Precio, publicacion, Autor);
        this.setTipo(tipo);
    }
    
    /**Getters.*/
    public String getTipo() {return tipo;} 
    /**Setters.*/
    public void setTipo(String t) {tipo = t;}
    
    public double calcularPrecio() {
        double precio = super.getPrecio();
        if ((super.getpublicacion().esAntes(15, 12, 2022)) && (super.getpublicacion().esDespues(15, 3, 2020))) {
            precio -= super.getPrecio() * 0.065;
        }
        
        if ((super.getAutor().getNacionalidad().equalsIgnoreCase("argentino")) && (getTipo().equalsIgnoreCase("divulgacion cientifica"))) {
                precio -= super.getPrecio()*0.10;
            }
        return precio;
    }
    
}