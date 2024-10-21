public abstract class Libro{
    /**Variables.*/
    private int ISBN;
    private String nombre;
    private int CantPaginas;
    private double Precio;
    private Fecha publicacion;
    private Autor Autor;
    
    /**Constructores.*/
    public Libro() {}
    
    public Libro(int ISBN, String nombre, int CantPaginas, double Precio, Fecha publicacion, Autor Autor){
        this.setISBN(ISBN);
        this.setnombre(nombre);
        this.setCantPaginas(CantPaginas);
        this.setPrecio(Precio);
        this.setpublicacion(publicacion);
        this.setAutor(Autor);
    
    }
    
    
    
     /**Getters.*/
    public int getISBN(){return ISBN;}
    public String getnombre(){return nombre;}
    public int getCantPaginas(){return CantPaginas;}
    public double getPrecio(){return Precio;}
    public Fecha getpublicacion(){return publicacion;}
    public Autor getAutor(){return Autor;}
    
     /**Setters.*/
    public void setISBN(int ISBN){this.ISBN = ISBN;}
    public void setnombre(String nombre){this.nombre = nombre;}
    public void setCantPaginas(int CantPaginas){this.CantPaginas = CantPaginas;}
    public void setPrecio(double Precio){this.Precio = Precio;}
    public void setpublicacion(Fecha publicacion){this.publicacion = publicacion;}
    public void setAutor(Autor Autor){this.Autor = Autor;}

    public abstract double calcularPrecio();


}