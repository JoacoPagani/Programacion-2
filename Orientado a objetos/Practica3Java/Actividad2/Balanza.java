public class Balanza {
    private int itemsT; double montoT;
    // Constructor nulo
    public Balanza() {}
    
    public void iniciarCompra() {
        montoT = 0;
        itemsT = 0;
    }
    
    public void registrarProducto(double pesoEnKg, double precioPorKg) {
        itemsT ++;
        montoT += (pesoEnKg * precioPorKg);
    }
    
    public double devolverMontoAPagar() {
        return montoT;
    }
        
    public String devolverResumenDeCompra() {
     return "Toral a pagar " + montoT + " por la compra " + itemsT + " productos";
    }
}

