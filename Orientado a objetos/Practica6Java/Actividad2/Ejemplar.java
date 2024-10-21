public abstract class Ejemplar {
    private int codigo;
    private int cantPaginas;
    private String resumen;
    private int añoPublicacion;
    private Responsable responsable;
    
    public Ejemplar() {}
    
    public Ejemplar(int codigo, int cantPaginas, String resumen, int añoPublicacion, Responsable responsable) {
        this.setCodigo(codigo);
        this.setCantPaginas(cantPaginas);
        this.setResumen(resumen);
        this.setAñoPublicacion(añoPublicacion);
        this.setResponsable(responsable);
    }
    
    //Setters
    public void setCodigo(int c) {codigo = c;}
    public void setCantPaginas(int p) {cantPaginas = p;}
    public void setResumen(String r){resumen = r;}
    public void setAñoPublicacion(int a) {añoPublicacion = a;}
    public void setResponsable(Responsable r) {responsable = r;}
    
    //Getters 
    public int getCodigo() {return codigo;}
    public int getCantPaginas() {return cantPaginas;}
    public String getResumen() {return resumen;}
    public int getAñoPublicacion() {return añoPublicacion;}
    public Responsable getResponsable() {return responsable;}
    
    public abstract String informe();
    
    public abstract String toString();

}