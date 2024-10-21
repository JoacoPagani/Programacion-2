public class Automotor extends Vehiculo {
    private String patente;
    private double adicional;
    private String descripcion;
    
    public Automotor() {} //constructor vacio
    
    public Automotor(int año, double importe, Propietario propietario, String patente, double adicional, String descripcion){
        super(año, importe, propietario);
        this.setPatente(patente);
        this.setAdicional(adicional);
        this.setDescripcion(descripcion);
    }
    
    //Setters
    public void setPatente(String p) {patente = p;}
    public void setAdicional(double a) {adicional = a;}
    public void setDescripcion(String d) {descripcion = d;}
    
    //Getters
    public String getPatente() {return patente;}
    public double getAdicional() {return adicional;}
    public String getDescripcion() {return descripcion;}
    
    
    //Calcular coste total
    public double calcularTotal() {
        return (super.getImporte() + getAdicional());
    }
}