import java.util.Scanner;

public class MainEj5
{
    /**
     * Método main
     * 
     */
    public static void main(String[] args)
    {
        //Paso 1: Declarar la variable vector de alturas
        double[] alturas = new double[15];
            
        
        //Paso 2: Declarar indice y promedio (iniciarlo)
        int suma = 0;
        int n = 15;
        int contadorMayorPromedio = 0;
        double p;
        
        //Pasao 3: Declarar y crear el scanner
        Scanner scanner = new Scanner(System.in);

        //Paso 4: Crear el vector para 15 valores
        for (int i = 0; i < n; i++) { 
            //Paso 5: Ingresar 15 numeros, cargarlos en el vector, ir calculando la suma
            System.out.println("Ingrese la altura del jugador " + (i+1) + ":");
            alturas[i] = scanner.nextDouble();
            suma += alturas[i];
        }
        
        //Paso 6: Calcular el promedio
        Promedio promedio = new Promedio(suma, n);
        p = promedio.getResultado();
        System.out.println("Altura promedio: " + p );
        
        
        //Paso 7: Recorrer el vector, contar los números que son mayores que el promedio
        for (int i = 0; i < n; i++) { 
            if (alturas[i] > p) {
                contadorMayorPromedio++;
            }
        }
         System.out.println("Cantidad de jugadores con altura mayor al promedio: " + contadorMayorPromedio);
}
}