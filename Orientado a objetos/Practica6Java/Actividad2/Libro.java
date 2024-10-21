public class Libro extends Ejemplar {
    private String titulo;
    private int cantCapitulos;
    private boolean edicionBolsillo;
    
    
    public Libro(){}
    
    public Libro(String titulo,int cantCapitulos,boolean edicionBolsillo,int codigo, int cantPaginas, String resumen, int añoPublicacion, Responsable responsable){
        super(codigo,cantPaginas, resumen, añoPublicacion, responsable);
        this.setTitulo(titulo);
        this.setCantCapitulos(cantCapitulos);
        this.setEdicionBolsillo(edicionBolsillo);
    }
    
    /**Getters.*/
    public String getTitulo(){return titulo;}
    public int getCantCapitulos(){return cantCapitulos;}
    public boolean getEdicionBolsillo(){return edicionBolsillo;}

     /**Setters.*/
    public void setTitulo(String titulo){this.titulo = titulo;}
    public void setCantCapitulos(int cantCapitulos){this.cantCapitulos = cantCapitulos;}
    public void setEdicionBolsillo(boolean edicionBolsillo){this.edicionBolsillo = edicionBolsillo;}
    
    /**To String.*/
    public String toString() {return (super.getCodigo() + " " + getTitulo() + " " + super.getResponsable());}
    
    public String informe() {
        String aux;
        if (getEdicionBolsillo()) { aux = (getTitulo() + " " + " Edicion de bolsillo");
        } else {aux = getTitulo();}
        return aux;
    }
}