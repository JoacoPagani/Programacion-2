public abstract class Vehiculo
{
   private int año; //Año de fabricacion
   private double importe; //importe de gestion basico
   private Propietario propietario; //propietario del vehiculo
   
   public Vehiculo() {} //Constructor vacio
   
   public Vehiculo(int unAño, double unImporte, Propietario unPropietario) {
        año = unAño;
        importe = unImporte;
        propietario = unPropietario;
    }
   
   //Setters
    public void setPropietario(Propietario propietario){
        this.propietario=propietario;
    }
    public void setAño(int año){
        this.año=año;
    }
    public void setImporte(double importe){
        this.importe=importe;
    }
    
    //Getters
    public int getAño(){
        return año;
    }
    public double getImporte(){
        return importe;
    }
    public Propietario getPropietario(){
        return propietario;
    }   
    
    public abstract double calcularTotal();
}
