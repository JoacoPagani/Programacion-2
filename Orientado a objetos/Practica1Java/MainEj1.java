import java.util.Scanner;

public class MainEj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar los tres valores desde el teclado
        System.out.println("Ingrese el primer valor (lado a): ");
        double a = sc.nextDouble();

        System.out.println("Ingrese el segundo valor (lado b): ");
        double b = sc.nextDouble();

        System.out.println("Ingrese el tercer valor (lado c): ");
        double c = sc.nextDouble();

        // Crear el objeto Triangulo
        Triangulo triangulo = new Triangulo(a, b, c);

        // Verificar si el triángulo es válido y mostrar el resultado
        if (triangulo.esValido()) {
            System.out.println("El triángulo es válido.");
            System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
        } else {
            System.out.println("Los valores ingresados no forman un triángulo válido.");
        }

        sc.close();
    }
}

