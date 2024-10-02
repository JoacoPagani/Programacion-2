import java.util.Scanner;
public class Main{
    public static void main(){
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el lado a del triangulo: ");
        a = in.nextInt();
        System.out.println("Ingrese el lado b del triangulo: ");
        b = in.nextInt();
        System.out.println("Ingrese el lado c del triangulo: ");
        c = in.nextInt();
        System.out.println("Ingrese el color del triangulo: ");
        String color = in.next();
        System.out.println("Ingrese el color de linea del triangulo: ");
        String colorL = in.next();
        Triangulo t = new Triangulo(a,b,c, color, colorL);
        System.out.println("El perimetro del triangulo es: " + t.calcularPerimetro() + " y el area: " + t.calcularArea() );
        
    }
}