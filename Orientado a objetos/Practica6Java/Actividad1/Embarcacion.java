public class Embarcacion extends Vehiculo {
    private int codREY;
    private String nombre;
    private String tipoEmbarcacion;
    private int esLora;
    private double peso;
    private double precioTotal;
    
    public Embarcacion() {} //Constructor vacio
    
    public Embarcacion(int año, Propietario propietario, int importeBasico,int codREY, String Nombre, String tipoEmbarcacion, int Eslora, int Peso, int precioTotal){
        super(año,importeBasico,propietario);
        this.setCodREY(codREY);
        this.setNombre(nombre);
        this.setTipoEmbarcacion(tipoEmbarcacion);
        this.setLora(esLora);
        this.setPeso(peso);
        this.setPrecioTotal(precioTotal);
    }
    
    //setters
    public void setCodREY(int c) {codREY = c;}
    public void setNombre(String n) {nombre = n;}
    public void setTipoEmbarcacion(String e) {tipoEmbarcacion = e;}
    public void setLora(int l) {esLora = l;}
    public void setPeso(double p){peso = p;}
    public void setPrecioTotal(double p) {precioTotal = p;}
    
    //Getters 
    public int getCodREY() {return codREY;} 
    public String getNombre() {return nombre;}
    public String getTipoEmbracacion() {return tipoEmbarcacion;}
    public int getEsLora() {return esLora;}
    public double getPeso() {return peso;}
    public double getPrecioTotal() {return precioTotal;}
    
    public double calcularTotal() {
        double pagoSemestral;
        if (getPrecioTotal() > 180000) {pagoSemestral= 0.05 * getPrecioTotal();
        } else if (getPrecioTotal() > 6000) {pagoSemestral= 0.04 * getPrecioTotal();
        } else {pagoSemestral = 0.02 * getPrecioTotal();}
        return (super.getImporte() + pagoSemestral);
    }
}