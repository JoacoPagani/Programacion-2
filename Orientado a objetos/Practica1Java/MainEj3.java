
/**
  Escriba un programa que imprima en consola el factorial de un número N (ingresado
por teclado, N > 0). Ejemplo: para N=5 debería imprimir 5! = 120
 */
import java.util.Scanner;
public class MainEj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Ingresar el N
        do {
            System.out.println("Ingrese el valor de N / N>0 ");
            n = sc.nextInt();
        } while (n <= 0);
        
        Factorial factorial = new Factorial(n);
        
        System.out.println("El resultado de " + n + "! es : " + factorial.getResultado());
    
    
            }
}
