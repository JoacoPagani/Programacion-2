/* 
 Escriba un programa que defina una matriz de enteros de tamaño 10x10. Inicialice la
matriz con los primeros 100 números pares (ej: la posición 0,0 contendrá 0; la posición
0,1 contendrá 2; la posición 0,2 contendrá 4; así siguiendo).
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de todos los elementos almacenados entre las filas
2 y 9 y las columnas 0 y 3
- Generar un vector de 10 posiciones donde cada posición i contiene la suma de
los elementos de la columna i de la matriz.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario imprima
“No se encontró el elemento”
 */
import java.util.Scanner;

public class MainEj6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Crear una instancia de la clase
            MatrizPares matriz = new MatrizPares();
            // Llenar la matriz con los primeros 100 números pares
            matriz.setMatrizPares();
            System.out.println("Matriz 10x10 con los primeros 100 números pares:");
            matriz.ImprimirMatriz();
            matriz.SumaAcotada();
            
        }
}