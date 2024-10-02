public class Triangulo {
    private int a; int b; int c; String color; String colorLinea;
    public Triangulo(int a, int b, int c, String color, String colorLinea ) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        this.colorLinea = colorLinea;
    }
    
    //setters
    public void setLadoA(int a) {this.a = a;}
    public void setLadoB(int b) {this.b = b;}
    public void setLadoC(int c) {this.c = c;}
    
    //getters
    public int getLadoA() {return a;}
    public int getLadoB() {return b;}
    public int getLadoC() {return c;}
    
    //calcular area
public double calcularArea() {
    double s = (a + b + c) / 2.0; // Usar 2.0 para asegurar que es división de punto flotante
    double area = s * (s - a) * (s - b) * (s - c);
    
    /*if (area < 0) {
        System.out.println("Los lados no forman un triángulo válido.");
        return Double.NaN;  // Retorna NaN si los lados no son válidos
    } */
    
    return Math.sqrt(area);  // Calcular área solo si es un valor positivo
}
            
    //calcular perimetro
    public double calcularPerimetro() {
        return a+b+c;
    }
}